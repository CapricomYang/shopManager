package cn.edu.jxufe.service.impl;

import cn.edu.jxufe.dao.TGoodsDAO;
import cn.edu.jxufe.entity.TGoods;
import cn.edu.jxufe.service.GoodsInfoServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 26708 on 2018/8/7.
 */
@Service
public class GoodsInfoServerImpl implements GoodsInfoServer{
    @Autowired
    private TGoodsDAO tGoodsDAO;

    @Override
    public List<TGoods> findAllGoods() {
        return tGoodsDAO.findAllGoods();
    }
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