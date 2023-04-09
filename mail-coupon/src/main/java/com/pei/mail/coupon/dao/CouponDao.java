package com.pei.mail.coupon.dao;

import com.pei.mail.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author PEIGEN
 * @email PEIGEN@163.com
 * @date 2023-03-07 19:54:31
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
