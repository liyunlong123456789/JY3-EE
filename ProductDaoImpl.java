package com.neuedu.Dao;

import com.neuedu.dataSource.DruidDataSource;
import com.neuedu.pojo.Product;
import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class ProductDaoImpl implements ProductDao{
    private DruidDataSource dds;
    private QueryRunner qr;
    public ProductDaoImpl(){
        this.dds =DruidDataSource.getDataSource();
        this.qr = new QueryRunner();
    }
    //添加方法
    @Override
    public void addOneProduct(Product product) {

        Connection connention = dds.getConnention();
        String sql = "INSERT INTO product VALUES(?,?,?,?,?,?,?,?,?)";
        try {
            qr.update(connention, sql, product.getPro_id(), product.getPro_name(), product.getPro_price(), product.getPro_image(), product.getPro_des(), product.getPro_stock(), product.getPro_date(), product.getPro_cate_id(), product.getPro_factory());
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                DbUtils.close(connention);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

    @Override
    public List<Product> getAllPro() {
        List<Product> pros = null;
        Connection connention = dds.getConnention();
        String sql = "SELECT * FROM product";
        try {
            pros = qr.query(connention, sql, new BeanListHandler<>(Product.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                DbUtils.close(connention);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return pros;
    }

    @Override
    public void deleteUser(String proid) {

        String sql = "DELETE FROM product WHERE pro_id = ?";
        Connection connention = dds.getConnention();
        try {
            qr.update(connention,sql,proid);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                DbUtils.close(connention);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void alterUser(Product product) {

        String sql = "UPDATE product SET pro_name = ?,pro_price = ?,pro_image = ?,pro_des = ?,pro_stock=?,pro_date=?,pro_cate_id = ?,pro_factory=? WHERE pro_id = ?";
        Connection connention = dds.getConnention();
        try {
            qr.update(connention,sql,product.getPro_name(),product.getPro_price(),product.getPro_image(),product.getPro_des(),product.getPro_stock(),product.getPro_date(),product.getPro_cate_id(),product.getPro_factory(),product.getPro_id());
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                DbUtils.close(connention);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
