//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.jk.goods.controller;

import com.alibaba.dubbo.config.annotation.Reference;

import java.util.List;
import java.util.Map;

import com.jk.goods.service.CommodityService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("commodity")
public class CommodityController {
    @Reference(
            version = "1.0"
    )
    private CommodityService commodityService;

    public CommodityController() {
    }

    @RequestMapping("queryCommodityById")
    public String queryCommodityById(Integer id, Model model) {
        Map map = this.commodityService.queryCommodityById(id);
        model.addAttribute("commodity", map);
        return "showCommoditys";
    }

    @RequestMapping("queryColorList")
    @ResponseBody
    public List queryColorList(Integer id) {
        List list = this.commodityService.queryColorList(id);
        return list;
    }

    @RequestMapping("queryVersionsList")
    @ResponseBody
    public List queryVersionsList() {
        List m = this.commodityService.queryVersionsList();
        return m;
    }

    @RequestMapping("changeColororVersion")
    @ResponseBody
    public List changeColororVersion(Integer id, Integer flag) {
        List list = this.commodityService.changeColororVersion(id, flag);
        return list;
    }

    @RequestMapping("queryTypeCommodity")
    public List queryTypeCommodity(Integer id) {
        List list = this.commodityService.queryTypeCommodity(id);
        return list;
    }

}
