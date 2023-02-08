package com.gu.gulimall.product;

import com.gu.gulimall.product.entity.BrandEntity;
import com.gu.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class GulimallProductApplicationTests {

    @Resource
    BrandService service;

    @Test
    void contextLoads() {
        BrandEntity entity = new BrandEntity();
        entity.setName("华为");
        service.save(entity);
        System.out.println("保存成功");
    }

}
