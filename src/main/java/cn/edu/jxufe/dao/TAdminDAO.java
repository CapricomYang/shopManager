package cn.edu.jxufe.dao;

import cn.edu.jxufe.entity.TAdmin;

import org.springframework.stereotype.Repository;

/**
 * TAdminDAO继承基类
 */
@Repository
public interface TAdminDAO extends MyBatisBaseDao<TAdmin, Integer> {
}