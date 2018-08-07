package cn.edu.jxufe.dao;

import cn.edu.jxufe.entity.TCollection;

import org.springframework.stereotype.Repository;

/**
 * TCollectionDAO继承基类
 */
@Repository
public interface TCollectionDAO extends MyBatisBaseDao<TCollection, Integer> {
}