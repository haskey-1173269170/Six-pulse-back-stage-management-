//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.jk.goods.model;

import java.io.Serializable;

public class ProductOrigin implements Serializable {
    private static final long serialVersionUID = 5562730406412052434L;
    private Integer productOrigin_id;
    private String productOrigin_name;

    public ProductOrigin() {
    }

    public Integer getProductOrigin_id() {
        return this.productOrigin_id;
    }

    public void setProductOrigin_id(Integer productOrigin_id) {
        this.productOrigin_id = productOrigin_id;
    }

    public String getProductOrigin_name() {
        return this.productOrigin_name;
    }

    public void setProductOrigin_name(String productOrigin_name) {
        this.productOrigin_name = productOrigin_name;
    }
}
