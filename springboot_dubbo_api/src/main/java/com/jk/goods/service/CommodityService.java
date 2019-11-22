package com.jk.goods.service;

import java.util.List;
import java.util.Map;

public interface CommodityService {

    Map queryCommodityById(Integer id);

    List queryColorList(Integer id);

    List queryVersionsList();

    List changeColororVersion(Integer id, Integer flag);

    List queryTypeCommodity(Integer id);
}

