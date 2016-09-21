package com.pt.mapper;

import com.pt.model.JobResume;

public interface JobResumeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(JobResume record);

    int insertSelective(JobResume record);

    JobResume selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(JobResume record);

    int updateByPrimaryKey(JobResume record);
}