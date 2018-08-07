package cn.edu.jxufe.dao;

import cn.edu.jxufe.entity.TType;

import org.springframework.stereotype.Repository;

/**
 * TTypeDAO继承基类
 */
@Repository
public interface TTypeDAO extends MyBatisBaseDao<TType, Integer> {
}