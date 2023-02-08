package com.gu.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gu.gulimall.common.utils.PageUtils;
import com.gu.gulimall.ware.entity.WareOrderTaskDetailEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author ???
 * @email 2256030729@qq.com
 * @date 2023-01-17 16:21:52
 */
public interface WareOrderTaskDetailService extends IService<WareOrderTaskDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

