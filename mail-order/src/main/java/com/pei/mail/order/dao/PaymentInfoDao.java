package com.pei.mail.order.dao;

import com.pei.mail.order.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author PEIGEN
 * @email PEIGEN@163.com
 * @date 2023-03-07 21:03:33
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}
