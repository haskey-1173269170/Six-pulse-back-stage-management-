//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.jk.goods.model;

import java.io.Serializable;

public class Operatingsystem implements Serializable {
    private static final long serialVersionUID = 3837594983066879850L;
    private Integer operatingSystem_id;
    private String operatingSystem_name;

    public Operatingsystem() {
    }

    public Integer getOperatingSystem_id() {
        return this.operatingSystem_id;
    }

    public void setOperatingSystem_id(Integer operatingSystem_id) {
        this.operatingSystem_id = operatingSystem_id;
    }

    public String getOperatingSystem_name() {
        return this.operatingSystem_name;
    }

    public void setOperatingSystem_name(String operatingSystem_name) {
        this.operatingSystem_name = operatingSystem_name;
    }
}
