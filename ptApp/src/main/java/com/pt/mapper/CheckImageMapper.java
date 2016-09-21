package com.pt.mapper;

import com.pt.model.CheckImage;

public interface CheckImageMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CheckImage record);

    int insertSelective(CheckImage record);

    CheckImage selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CheckImage record);

    int updateByPrimaryKeyWithBLOBs(CheckImage record);

    int updateByPrimaryKey(CheckImage record);
}