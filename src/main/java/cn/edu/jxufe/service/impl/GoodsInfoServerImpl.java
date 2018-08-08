package cn.edu.jxufe.service.impl;

import cn.edu.jxufe.dao.TGoodsDAO;
import cn.edu.jxufe.entity.TGoods;
import cn.edu.jxufe.service.GoodsInfoServer;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

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

    @Override
    public Map findAllGoods(int page, int rows) {
        PageHelper.startPage(page,rows);
        PageInfo pageInfo=new PageInfo(tGoodsDAO.findAllGoods());
        Map map=new HashMap<Object,Object>();
        map.put("total",pageInfo.getTotal());
        map.put("rows",pageInfo.getList());
        return map;
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