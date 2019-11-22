//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.jk.goods.mapper;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

public interface CommodityMapper {
    Map queryCommodityById(@Param("id") Integer id);

    List<Map<String, Object>> queryColorList(Integer id);

    List<Map<String, Object>> queryVersionsList();

    List<Map<String, Object>> changeColor(Integer id);

    List<Map<String, Object>> changeVersion(Integer id);

    List<Map<String, Object>> queryTypeCommodity(Integer id);
}
