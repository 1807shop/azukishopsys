package com.azuki.goodstypesys.vo;

import lombok.ToString;

import java.util.List;

@ToString
public class GoodsTypeVo {
    int currentPage;
    String typeName;
    String parentId;
    List<Integer> goodsTypeIds;

    public List<Integer> getGoodsTypeIds() {
        return goodsTypeIds;
    }

    public void setGoodsTypeIds(List<Integer> goodsTypeIds) {
        this.goodsTypeIds = goodsTypeIds;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }
}
