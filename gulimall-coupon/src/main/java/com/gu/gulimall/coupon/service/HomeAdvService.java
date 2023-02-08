package com.gu.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gu.gulimall.common.utils.PageUtils;
import com.gu.gulimall.coupon.entity.HomeAdvEntity;

import java.util.Map;

/**
 * 首页轮播广告
 *
 * @author ???
 * @email 2256030729@qq.com
 * @date 2023-01-16 17:48:37
 */
public interface HomeAdvService extends IService<HomeAdvEntity> {

    PageUtils queryPage(Map<String, Object> params);
}
