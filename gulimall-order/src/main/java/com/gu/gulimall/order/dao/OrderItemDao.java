package com.gu.gulimall.order.dao;

import com.gu.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author ???
 * @email 2256030729@qq.com
 * @date 2023-01-17 01:19:53
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
