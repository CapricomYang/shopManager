package cn.edu.jxufe.dao;

import cn.edu.jxufe.entity.TOrder;

import org.springframework.stereotype.Repository;

/**
 * TOrderDAO继承基类
 */
@Repository
public interface TOrderDAO extends MyBatisBaseDao<TOrder, Integer> {
}