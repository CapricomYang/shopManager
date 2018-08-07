package cn.edu.jxufe.dao;

import cn.edu.jxufe.entity.TArticle;

import org.springframework.stereotype.Repository;

/**
 * TArticleDAO继承基类
 */
@Repository
public interface TArticleDAO extends MyBatisBaseDao<TArticle, Integer> {
}