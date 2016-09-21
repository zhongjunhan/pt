package com.pt.mapper;

import com.pt.model.Resume;

public interface ResumeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Resume record);

    int insertSelective(Resume record);

    Resume selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Resume record);

    int updateByPrimaryKey(Resume record);
}