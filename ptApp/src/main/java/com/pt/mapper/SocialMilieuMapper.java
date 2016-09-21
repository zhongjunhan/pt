package com.pt.mapper;

import com.pt.model.SocialMilieu;

public interface SocialMilieuMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SocialMilieu record);

    int insertSelective(SocialMilieu record);

    SocialMilieu selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SocialMilieu record);

    int updateByPrimaryKey(SocialMilieu record);
}