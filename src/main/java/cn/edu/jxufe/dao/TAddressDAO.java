package cn.edu.jxufe.dao;

import cn.edu.jxufe.entity.TAddress;

import org.springframework.stereotype.Repository;

/**
 * TAddressDAO继承基类
 */
@Repository
public interface TAddressDAO extends MyBatisBaseDao<TAddress, Integer> {
}