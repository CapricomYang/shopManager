package cn.edu.jxufe.dao;

import cn.edu.jxufe.entity.TAdmin;

import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * TAdminDAO继承基类
 */
@Repository
public interface TAdminDAO extends MyBatisBaseDao<TAdmin, Integer> {
    public List<TAdmin> findAllAdmin();
    public int updateTAdmin(TAdmin tAdmin);
    public int addTAdmin(TAdmin tAdmin);
    public int deleteTAdmin(int id);
    public List<TAdmin> findTAdmin(int id);
}