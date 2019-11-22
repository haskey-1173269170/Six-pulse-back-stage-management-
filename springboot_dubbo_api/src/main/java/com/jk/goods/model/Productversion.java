//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.jk.goods.model;

import java.io.Serializable;

public class Productversion implements Serializable {
    private static final long serialVersionUID = -7296253358570998154L;
    private Integer productVersion_id;
    private String productVersion_name;
    private Integer productVersion_price;

    public Productversion() {
    }

    public Integer getProductVersion_id() {
        return this.productVersion_id;
    }

    public void setProductVersion_id(Integer productVersion_id) {
        this.productVersion_id = productVersion_id;
    }

    public String getProductVersion_name() {
        return this.productVersion_name;
    }

    public void setProductVersion_name(String productVersion_name) {
        this.productVersion_name = productVersion_name;
    }

    public Integer getProductVersion_price() {
        return this.productVersion_price;
    }

    public void setProductVersion_price(Integer productVersion_price) {
        this.productVersion_price = productVersion_price;
    }
}
