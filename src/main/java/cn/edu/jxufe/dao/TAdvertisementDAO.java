package cn.edu.jxufe.dao;

import cn.edu.jxufe.entity.TAdvertisement;

import org.springframework.stereotype.Repository;

/**
 * TAdvertisementDAO继承基类
 */
@Repository
public interface TAdvertisementDAO extends MyBatisBaseDao<TAdvertisement, Integer> {
}