package com.gu.gulimall.product.service.impl;

import com.alibaba.nacos.shaded.org.checkerframework.checker.units.qual.C;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gu.gulimall.common.utils.PageUtils;
import com.gu.gulimall.common.utils.Query;

import com.gu.gulimall.product.dao.CategoryDao;
import com.gu.gulimall.product.entity.CategoryEntity;
import com.gu.gulimall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        List<CategoryEntity> list = baseMapper.selectList(null);

        List<CategoryEntity> Level1Menus = list.stream().filter(
                categoryEntity -> categoryEntity.getParentCid() == 0
        ).map((menu) ->{
           menu.setChildren(getChildren(menu,list));
           return menu;}
        ).sorted( (menu1,menu2) ->{
            return (menu1.getSort()==null?0:menu1.getSort()) - (menu2.getSort()==null?0:menu2.getSort());
        }).collect(Collectors.toList());
        return Level1Menus;
    }

    @Override
    public void removeMenusByIds(List<Long> asList) {
        baseMapper.deleteBatchIds(asList);
    }

    public List<CategoryEntity> getChildren(CategoryEntity level1 , List<CategoryEntity> all) {
        List<CategoryEntity> entityList = all.stream().filter(
                categoryEntity -> {
                    return Objects.equals(categoryEntity.getParentCid(), level1.getCatId());
                }
        ).map(categoryEntity -> {
            categoryEntity.setChildren(getChildren(categoryEntity,all));
            return categoryEntity;
        }).sorted((menu1,menu2) -> {
            return (menu1.getSort()==null?0:menu1.getSort()) - (menu2.getSort()==null?0:menu2.getSort());
        }).collect(Collectors.toList());
        return entityList;
    }

}