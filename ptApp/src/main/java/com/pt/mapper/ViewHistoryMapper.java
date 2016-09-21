package com.pt.mapper;

import com.pt.model.ViewHistory;

public interface ViewHistoryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ViewHistory record);

    int insertSelective(ViewHistory record);

    ViewHistory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ViewHistory record);

    int updateByPrimaryKey(ViewHistory record);
}