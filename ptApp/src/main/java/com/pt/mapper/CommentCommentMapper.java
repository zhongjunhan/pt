package com.pt.mapper;

import com.pt.model.CommentComment;

public interface CommentCommentMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CommentComment record);

    int insertSelective(CommentComment record);

    CommentComment selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CommentComment record);

    int updateByPrimaryKey(CommentComment record);
}