package com.example.recyclerview;

import android.widget.TextView;

import java.io.Serializable;

public class Product {

    private int productno,productStock;
    private String productTitle,productDis;

    public int getProductno() {
        return productno;
    }

    public void setProductno(int productno) {
        this.productno = productno;
    }

    public int getProductStock() {
        return productStock;
    }

    public void setProductStock(int productStock) {
        this.productStock = productStock;
    }

    public String getProductTitle() {
        return productTitle;
    }

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

    public String getProductDis() {
        return productDis;
    }

    public void setProductDis(String productDis) {
        this.productDis = productDis;
    }

    public Product(int productno, int productStock, String productTitle, String productDis) {
        this.productno = productno;
        this.productStock = productStock;
        this.productTitle = productTitle;
        this.productDis = productDis;
    }
}
