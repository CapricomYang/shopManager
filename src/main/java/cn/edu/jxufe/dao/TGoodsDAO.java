package cn.edu.jxufe.dao;

import cn.edu.jxufe.entity.TGoods;

import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * TGoodsDAO继承基类
 */
@Repository
public interface TGoodsDAO extends MyBatisBaseDao<TGoods, Integer> {
    public List<TGoods> findAllGoods();
}