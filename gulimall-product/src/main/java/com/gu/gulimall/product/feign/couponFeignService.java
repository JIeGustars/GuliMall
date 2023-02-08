package com.gu.gulimall.product.feign;

import com.gu.gulimall.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "gulimall-coupon")
public interface couponFeignService {
    @RequestMapping("/coupon/coupon/test")
    public R test();
}
