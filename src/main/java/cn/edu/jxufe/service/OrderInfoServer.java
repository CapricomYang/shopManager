package cn.edu.jxufe.service;

import cn.edu.jxufe.entity.TOrder;

import java.util.List;
import java.util.Map;

/**
 * @Author ${user}
 * @Date 2018/8/17.
 * @thisprojece YQC
 * @Description github:https://github.com/CapricomYang
 */
public interface OrderInfoServer {
    public List<TOrder> findAllOrder();
    public Map findAllOrder(int page ,int rows,Integer name);
    public int updateOrder(TOrder tOrder);
    public int addOrder(TOrder tOrder);
    public int deleteOrder(int id);
    public List<TOrder> findOrder(int name);

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