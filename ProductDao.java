package com.neuedu.Dao;

import com.neuedu.pojo.Product;

import java.util.List;

public interface ProductDao {

    //添加商品
    void addOneProduct(Product product);
    //显示商品
    List<Product> getAllPro();
    //删除商品
    void deleteUser(String proid);
    //修改商品
    void alterUser(Product product);
}
