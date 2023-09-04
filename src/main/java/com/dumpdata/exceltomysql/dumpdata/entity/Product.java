package com.dumpdata.exceltomysql.dumpdata.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {

    @Id
    private int Prod_id;
    private String Prod_Name;
    private String Prod_Desc;
    private Double Prod_Price;
    
    public Product() {
    }

    public Product(int prod_id, String prod_Name, String prod_Desc, Double prod_Price) {
        Prod_id = prod_id;
        Prod_Name = prod_Name;
        Prod_Desc = prod_Desc;
        Prod_Price = prod_Price;
    }

    public int getProd_id() {
        return Prod_id;
    }

    public void setProd_id(int prod_id) {
        Prod_id = prod_id;
    }

    public String getProd_Name() {
        return Prod_Name;
    }

    public void setProd_Name(String prod_Name) {
        Prod_Name = prod_Name;
    }

    public String getProd_Desc() {
        return Prod_Desc;
    }

    public void setProd_Desc(String prod_Desc) {
        Prod_Desc = prod_Desc;
    }

    public Double getProd_Price() {
        return Prod_Price;
    }

    public void setProd_Price(Double prod_Price) {
        Prod_Price = prod_Price;
    }

    

    
}
