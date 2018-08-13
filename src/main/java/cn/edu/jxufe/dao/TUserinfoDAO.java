package cn.edu.jxufe.dao;

import cn.edu.jxufe.entity.TUserinfo;

import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * TUserinfoDAO继承基类
 */
@Repository
public interface TUserinfoDAO extends MyBatisBaseDao<TUserinfo, String> {
    public List<TUserinfo> findAllUser();
    public int updateTUserinfo(TUserinfo tUserinfo);
    public int addTUserinfo(TUserinfo tUserinfo);
    public int deleteTUserinfo(String tel);
    public List<TUserinfo> findTUserinfo(String tel);
}