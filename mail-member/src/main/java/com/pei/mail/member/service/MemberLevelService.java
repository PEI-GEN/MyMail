package com.pei.mail.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pei.common.utils.PageUtils;
import com.pei.mail.member.entity.MemberLevelEntity;

import java.util.Map;

/**
 * 会员等级
 *
 * @author PEIGEN
 * @email PEIGEN@163.com
 * @date 2023-03-07 20:50:16
 */
public interface MemberLevelService extends IService<MemberLevelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

