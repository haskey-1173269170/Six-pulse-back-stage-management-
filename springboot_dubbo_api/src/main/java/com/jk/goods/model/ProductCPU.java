//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.jk.goods.model;

import java.io.Serializable;

public class ProductCPU implements Serializable {
    private static final long serialVersionUID = -8622265983649991561L;
    private Integer productCpu_id;
    private String productCpu_name;

    public ProductCPU() {
    }

    public Integer getProductCpu_id() {
        return this.productCpu_id;
    }

    public void setProductCpu_id(Integer productCpu_id) {
        this.productCpu_id = productCpu_id;
    }

    public String getProductCpu_name() {
        return this.productCpu_name;
    }

    public void setProductCpu_name(String productCpu_name) {
        this.productCpu_name = productCpu_name;
    }
}
