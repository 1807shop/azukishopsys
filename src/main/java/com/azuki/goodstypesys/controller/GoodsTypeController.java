package com.azuki.goodstypesys.controller;

import com.azuki.goodstypesys.pojo.GoodsType;
import com.azuki.goodstypesys.service.GoodsTypeService;
import com.azuki.goodstypesys.vo.GoodsTypeVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GoodsTypeController {

    @Autowired
    GoodsTypeService goodsTypeService;


    @RequestMapping(value = "GoodsTypeList",method = RequestMethod.POST)
    public Object GoodsTypeList(@RequestBody(required = false) GoodsTypeVo goodsTypeVo){
        PageHelper.startPage(goodsTypeVo.getCurrentPage(),3);//设置每页展示数据数量
        List<GoodsType> goodsTypeList = goodsTypeService.getGoodsTypeInfo(goodsTypeVo);
        PageInfo<GoodsType> goodsTypePageInfo = new PageInfo<GoodsType>(goodsTypeList);
        return goodsTypePageInfo;
    }

    @RequestMapping(value = "deleteGoodsType",method = RequestMethod.POST)
    public String deleteGoodsType(@RequestBody GoodsType goodsType){
        Boolean flag = false;
        flag = goodsTypeService.deleteGoodsType(goodsType.getCategoryId());
        return flag.toString();
    }

    @RequestMapping(value = "insertGoodsType",method = RequestMethod.POST)
    public String addGoodsType(@RequestBody GoodsType goodsType){
        Boolean flag = false;
        flag = goodsTypeService.addGoodsType(goodsType);
        return flag.toString();
    }

    @RequestMapping(value = "getGoodsTypeById",method = RequestMethod.POST)
    public Object getGoodsTypeById(@RequestBody GoodsType goodsType){
        goodsType = goodsTypeService.getGoodsTypeById(goodsType.getCategoryId());
        System.out.println(goodsType);
        return goodsType;
    }

    @RequestMapping(value = "updateGoodsType",method = RequestMethod.POST)
    public String updateGoodsType(@RequestBody GoodsType goodsType){
        Boolean flag = false;
        flag = goodsTypeService.updateGoodsType(goodsType);
        return flag.toString();
    }

    @RequestMapping(value = "batchDelete",method = RequestMethod.POST)
    public String batchDelete(@RequestBody GoodsTypeVo goodsTypeVo){
        Boolean flag = false;
        flag = goodsTypeService.batchDel(goodsTypeVo);
        return flag.toString();
    }
}
