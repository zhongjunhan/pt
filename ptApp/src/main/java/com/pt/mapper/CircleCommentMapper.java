package com.pt.mapper;

import com.pt.model.CircleComment;

public interface CircleCommentMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CircleComment record);

    int insertSelective(CircleComment record);

    CircleComment selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CircleComment record);

    int updateByPrimaryKey(CircleComment record);
}