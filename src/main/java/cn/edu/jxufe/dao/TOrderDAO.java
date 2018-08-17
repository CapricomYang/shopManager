package cn.edu.jxufe.dao;

import cn.edu.jxufe.entity.TOrder;

import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * TOrderDAO继承基类
 */
@Repository
public interface TOrderDAO extends MyBatisBaseDao<TOrder, Integer> {
    public List<TOrder> findAllOrder();
    public int updateOrder(TOrder tOrder);
    public int addOrder(TOrder tOrder);
    public int deleteOrder(int id);
    public List<TOrder> findOrder(int t);
}