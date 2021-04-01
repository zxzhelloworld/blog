package com.heian.service;

import com.heian.po.Comment;

import java.util.List;

/**
 * Created by 北极熊
 */
public interface CommentService {

    List<Comment> listCommentByBlogId(Long blogId);

    Comment saveComment(Comment comment);
}
