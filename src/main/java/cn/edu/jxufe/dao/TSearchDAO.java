package cn.edu.jxufe.dao;

import cn.edu.jxufe.entity.TSearch;

import org.springframework.stereotype.Repository;

/**
 * TSearchDAO继承基类
 */
@Repository
public interface TSearchDAO extends MyBatisBaseDao<TSearch, String> {
}