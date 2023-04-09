package com.pei.mail.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pei.common.to.SkuReductionTo;
import com.pei.common.utils.PageUtils;
import com.pei.mail.coupon.entity.SkuFullReductionEntity;

import java.util.Map;

/**
 * 商品满减信息
 *
 * @author PEIGEN
 * @email PEIGEN@163.com
 * @date 2023-03-07 19:54:31
 */
public interface SkuFullReductionService extends IService<SkuFullReductionEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveSkuReduction(SkuReductionTo reductionTo);
}

