package com.azuki.goodstypesys.mapper;

import com.azuki.goodstypesys.pojo.GoodsType;
import com.azuki.goodstypesys.vo.GoodsTypeVo;

import java.util.List;

public interface GoodsTypeMapper {

    List<GoodsType> getGoodsTypeInfo(GoodsTypeVo goodsTypeVo);

    int deleteGoodsType(int categoryId);

    int addGoodsType(GoodsType goodsType);

    GoodsType getGoodsTypeById(int categoryId);

    int updateGoodsType(GoodsType goodsType);

    int batchDel(GoodsTypeVo goodsTypeVo);
}
