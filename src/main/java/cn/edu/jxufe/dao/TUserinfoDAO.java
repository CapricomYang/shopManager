package cn.edu.jxufe.dao;

import cn.edu.jxufe.entity.TUserinfo;

import org.springframework.stereotype.Repository;

/**
 * TUserinfoDAO继承基类
 */
@Repository
public interface TUserinfoDAO extends MyBatisBaseDao<TUserinfo, String> {
}