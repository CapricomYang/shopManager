package cn.edu.jxufe.dao;

import cn.edu.jxufe.entity.TComment;

import org.springframework.stereotype.Repository;

/**
 * TCommentDAO继承基类
 */
@Repository
public interface TCommentDAO extends MyBatisBaseDao<TComment, Integer> {
}