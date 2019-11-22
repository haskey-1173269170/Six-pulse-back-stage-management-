//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.jk.goods.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.jk.goods.mapper.CommodityMapper;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;

@Service(
        version = "1.0"
)
public class CommodityServiceImpl implements CommodityService {
    @Autowired
    private CommodityMapper commodityMapper;

    public CommodityServiceImpl() {
    }

    public Map queryCommodityById(Integer id) {
        return this.commodityMapper.queryCommodityById(id);
    }

    public List queryColorList(Integer id) {
        return this.commodityMapper.queryColorList(id);
    }

    public List queryVersionsList() {
        return this.commodityMapper.queryVersionsList();
    }

    public List changeColororVersion(Integer id, Integer flag) {
        List list = null;
        if (flag == 1) {
            list = this.commodityMapper.changeColor(id);
        } else if (flag == 2) {
            list = this.commodityMapper.changeVersion(id);
        }

        return list;
    }

    public List queryTypeCommodity(Integer id) {
        return this.commodityMapper.queryTypeCommodity(id);
    }
}
