package cn.edu.jxufe.dao;

import cn.edu.jxufe.entity.TArticle;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * TArticleDAO继承基类
 */
@Repository
public interface TArticleDAO extends MyBatisBaseDao<TArticle, Integer> {
    public List<TArticle> findAllArticle();
    public int updateArticle(TArticle tGoods);
    public int addArticle(TArticle tGoods);
    public int deleteArticle(int id);
    public List<TArticle> findArticle(int t);
}