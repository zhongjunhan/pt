package com.pt.mapper;

import com.pt.model.CompanyUser;

public interface CompanyUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CompanyUser record);

    int insertSelective(CompanyUser record);

    CompanyUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CompanyUser record);

    int updateByPrimaryKey(CompanyUser record);
}