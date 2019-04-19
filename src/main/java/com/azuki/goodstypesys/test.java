package com.azuki.goodstypesys;

import com.azuki.goodstypesys.pojo.GoodsType;
import com.azuki.goodstypesys.service.GoodsTypeService;
import com.azuki.goodstypesys.vo.GoodsTypeVo;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: lew1sss
 * @Date: 2019/4/13 0013 16:02
 */
public class test {
    ApplicationContext context = new ClassPathXmlApplicationContext("spring-mybatis.xml","spring-service.xml");
    GoodsTypeService goodsTypeService = context.getBean(GoodsTypeService.class);

    @Test
    public void testGetGoodsTypeInfo(){
        GoodsTypeVo goodsTypeVo = new GoodsTypeVo();
        goodsTypeVo.setTypeName("test");
        goodsTypeVo.setParentId("0");
        List<GoodsType> goodsTypeList = goodsTypeService.getGoodsTypeInfo(goodsTypeVo);
        System.out.println(goodsTypeList);
    }

    @Test
    public void testDeleteGoodsType(){
        boolean flag = false;
        flag = goodsTypeService.deleteGoodsType(1);
        if (flag==true){
            System.out.println("删除成功");
        }else {
            System.out.println("删除失败");
        }
    }
    @Test
    public void testAddGoodsType(){
        boolean flag = false;
        GoodsType goodsType = new GoodsType();
        goodsType.setTypeName("test7");
        goodsType.setParentId(1);
        flag = goodsTypeService.addGoodsType(goodsType);
        if (flag==true){
            System.out.println("添加成功");
        }else {
            System.out.println("添加失败");
        }
    }

    @Test
    public void testGetGoodsTypeById(){

        GoodsType goodsType = goodsTypeService.getGoodsTypeById(1);
        System.out.println(goodsType);
    }

    @Test
    public void testUpdateGoodsType(){
        boolean flag = false;
        GoodsType goodsType = new GoodsType();
        goodsType.setTypeName("test6.0");
        goodsType.setParentId(2);
        goodsType.setCategoryId(6);
        flag = goodsTypeService.updateGoodsType(goodsType);
        if (flag==true){
            System.out.println("修改成功");
        }else {
            System.out.println("修改失败");
        }
    }

    @Test
    public void testBatchDel(){
        boolean flag = false;
        GoodsTypeVo goodsTypeVo = new GoodsTypeVo();
        List<Integer> test = new ArrayList<Integer>();
        test.add(1);
        test.add(2);
        goodsTypeVo.setGoodsTypeIds(test);
        flag = goodsTypeService.batchDel(goodsTypeVo);
        if (flag==true){
            System.out.println("批量删除成功");
        }else {
            System.out.println("批量删除失败");
        }
    }
}
