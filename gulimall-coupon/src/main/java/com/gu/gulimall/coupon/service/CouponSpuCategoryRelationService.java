package com.gu.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gu.gulimall.common.utils.PageUtils;
import com.gu.gulimall.coupon.entity.CouponSpuCategoryRelationEntity;

import java.util.Map;

/**
 * 优惠券分类关联
 *
 * @author ???
 * @email 2256030729@qq.com
 * @date 2023-01-16 17:48:37
 */
public interface CouponSpuCategoryRelationService extends IService<CouponSpuCategoryRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

