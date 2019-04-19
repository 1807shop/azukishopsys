package com.azuki.goodstypesys.service;

import com.azuki.goodstypesys.pojo.GoodsType;
import com.azuki.goodstypesys.vo.GoodsTypeVo;

import java.util.List;

public interface GoodsTypeService {

    List<GoodsType> getGoodsTypeInfo(GoodsTypeVo goodsTypeVo);
    boolean deleteGoodsType(int categoryId);
    boolean addGoodsType(GoodsType goodsType);
    GoodsType getGoodsTypeById(int categoryId);
    boolean updateGoodsType(GoodsType goodsType);
    boolean batchDel(GoodsTypeVo goodsTypeVo);
}
