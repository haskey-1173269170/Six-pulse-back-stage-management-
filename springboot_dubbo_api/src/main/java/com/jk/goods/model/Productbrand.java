//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.jk.goods.model;

import java.io.Serializable;

public class Productbrand implements Serializable {
    private static final long serialVersionUID = 9213690020858090100L;
    private Integer productBrand_id;
    private String productBrand_name;
    private Integer productBrand_typeId;

    public Productbrand() {
    }

    public Integer getProductBrand_id() {
        return this.productBrand_id;
    }

    public void setProductBrand_id(Integer productBrand_id) {
        this.productBrand_id = productBrand_id;
    }

    public String getProductBrand_name() {
        return this.productBrand_name;
    }

    public void setProductBrand_name(String productBrand_name) {
        this.productBrand_name = productBrand_name;
    }

    public Integer getProductBrand_typeId() {
        return this.productBrand_typeId;
    }

    public void setProductBrand_typeId(Integer productBrand_typeId) {
        this.productBrand_typeId = productBrand_typeId;
    }
}
