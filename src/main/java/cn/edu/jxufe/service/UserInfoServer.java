package cn.edu.jxufe.service;

import cn.edu.jxufe.entity.TUserinfo;

import java.util.List;
import java.util.Map;

/**
 * @Author ${user}
 * @Date 2018/8/12.
 * @thisprojece YQC
 * @Description github:https://github.com/CapricomYang
 */
public interface UserInfoServer {
    public List<TUserinfo> findAllTUserinfo();
    public Map findAllTUserinfo(int page ,int rows,String tel);
    public int updateTUserinfo(TUserinfo tGoods);
    public int addTUserinfo(TUserinfo tGoods);
    public int deleteTUserinfo(String tel);
    public List<TUserinfo> findTUserinfo(String tel);
}
/*
代码手中走~佛祖心中留！求永无BUG！
                   _ooOoo_
                  o8888888o
                  88" . "88
                  (| - - |)
                  O\  w  /O
               ____/`---'\____
             .'  \\|     |//  `.
            /  \\|||  :  |||//  \
           /  _||||| -:- |||||-  \
           |   | \\\  -  /// |   |
           | \_|  ''\---/''  |   |
            \  .-\__  `-`  ___/-. /
          ___`. .'  /--.--\  `. . __
       ."" '<  `.___\_<|>_/___.'  >'"".
      | | :  `- \`.;`\ _ /`;.`/ - ` : | |
      \  \ `-.   \_ __\ /__ _/   .-` /  /
 ======`-.____`-.___\_____/___.-`____.-'======
 */