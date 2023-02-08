package com.gu.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gu.gulimall.common.utils.PageUtils;
import com.gu.gulimall.ware.entity.PurchaseEntity;

import java.util.Map;

/**
 * 采购信息
 *
 * @author ???
 * @email 2256030729@qq.com
 * @date 2023-01-17 16:21:52
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

