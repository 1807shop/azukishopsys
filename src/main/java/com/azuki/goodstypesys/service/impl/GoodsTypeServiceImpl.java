package com.azuki.goodstypesys.service.impl;

import com.azuki.goodstypesys.mapper.GoodsTypeMapper;
import com.azuki.goodstypesys.pojo.GoodsType;
import com.azuki.goodstypesys.service.GoodsTypeService;
import com.azuki.goodstypesys.vo.GoodsTypeVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsTypeServiceImpl implements GoodsTypeService {

    @Autowired
    GoodsTypeMapper goodsTypeMapper;
    int count = 0;

    /**
     * 获取所有商品类型信息并展示
     * @param goodsTypeVo
     * @return
     */
    public List<GoodsType> getGoodsTypeInfo(GoodsTypeVo goodsTypeVo) {
        return goodsTypeMapper.getGoodsTypeInfo(goodsTypeVo);
    }

    /**
     * 删除单个商品类型
     * @param categoryId
     * @return
     */
    public boolean deleteGoodsType(int categoryId) {

        count = goodsTypeMapper.deleteGoodsType(categoryId);
        if (count>0){
            return true;
        }
        return false;
    }

    /**
     * 添加
     * @param goodsType
     * @return
     */
    public boolean addGoodsType(GoodsType goodsType) {

        count = goodsTypeMapper.addGoodsType(goodsType);
        if (count>0){
            return true;
        }
        return false;
    }

    /**
     * 通过id获取对应商品类型(回显)
     * @param categoryId
     * @return
     */
    public GoodsType getGoodsTypeById(int categoryId) {

        return goodsTypeMapper.getGoodsTypeById(categoryId);
    }

    /**
     * 修改
     * @param goodsType
     * @return
     */
    public boolean updateGoodsType(GoodsType goodsType) {
        count = goodsTypeMapper.updateGoodsType(goodsType);
        if (count>0){
            return true;
        }
        return false;
    }

    /**
     * 批量删除
     * @param goodsTypeVo
     * @return
     */
    public boolean batchDel(GoodsTypeVo goodsTypeVo) {
        count = goodsTypeMapper.batchDel(goodsTypeVo);
        if (count>0){
            return true;
        }
        return false;
    }
}
