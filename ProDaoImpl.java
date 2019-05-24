package com.neuedu.Dao;

import com.neuedu.dataSource.DruidDataSource;
import com.neuedu.pojo.Pro;
import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;

import java.sql.Connection;
import java.sql.SQLException;

public class ProDaoImpl implements ProDao {
    private DruidDataSource dds;
     private QueryRunner qr;
    public ProDaoImpl(){
        this.dds = DruidDataSource.getDataSource();
        qr =new QueryRunner();
    }
    @Override
    public void addOneProduct(Pro pro) {
        Connection connention = dds.getConnention();
        String sql = "INSERT INTO product VALUES(?,?,?,?,?,?,?,?,?)";
        try {
            qr.update(connention,sql,pro.getPro_id(),pro.getPro_name(),pro.getPro_price(),pro.getPro_image(),pro.getPro_des(),pro.getPro_stock(),pro.getPro_date(),pro.getPro_cate_id(),pro.getPro_factory());
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
