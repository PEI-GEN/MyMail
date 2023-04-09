package com.pei.mail.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pei.common.utils.PageUtils;
import com.pei.mail.coupon.entity.CouponEntity;

import java.util.Map;

/**
 * 优惠券信息
 *
 * @author PEIGEN
 * @email PEIGEN@163.com
 * @date 2023-03-07 19:54:31
 */
public interface CouponService extends IService<CouponEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

