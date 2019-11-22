//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.jk.goods.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"to"})
public class ToController {

    @RequestMapping({"cmsLogin"})
    public String tocmsLogin() {
        return "login";
    }

    @RequestMapping({"toPayMent"})
    public String toPayMent() {
        return "pay/toPay";
    }

    @RequestMapping({"toPay"})
    public String toPay() {
        return "pay/paysuccess";
    }

    @RequestMapping({"toGoodsInfo"})
    public String toGoodsInfo() {
        return "showCommoditys";
    }

    @RequestMapping({"toIndex"})
    public String toIndex() {
        return "index";
    }
}
