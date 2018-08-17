package cn.edu.jxufe.service.impl;

import cn.edu.jxufe.dao.TOrderDAO;
import cn.edu.jxufe.entity.TOrder;
import cn.edu.jxufe.service.OrderInfoServer;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author ${user}
 * @Date 2018/8/17.
 * @thisprojece YQC
 * @Description github:https://github.com/CapricomYang
 */
@Service
public class OrderInfoServerImpl implements OrderInfoServer{
    @Autowired
    private TOrderDAO tOrderDAO;

    @Override
    public List<TOrder> findAllOrder() {
        return tOrderDAO.findAllOrder();
    }

    @Override
    public Map findAllOrder(int page, int rows, long name) {
        if(name==-999){
            System.out.println("orderorderorderorderorderorderorderorderorder");
            PageHelper.startPage(page, rows);
            PageInfo pageInfo=new PageInfo(tOrderDAO.findAllOrder());

            Map map=new HashMap<Object,Object>();
            map.put("total",pageInfo.getTotal());
            map.put("rows",pageInfo.getList());
            return map;
        }
        else{
            System.out.println("order===================================");
            PageHelper.startPage(page,rows);
            PageInfo pageInfo=new PageInfo(this.findOrder(name));
            Map map=new HashMap<Object,Object>();
            map.put("total",pageInfo.getTotal());
            map.put("rows",pageInfo.getList());
            return map;
        }
    }

    @Override
    public int updateOrder(TOrder tOrder) {
        return tOrderDAO.updateByPrimaryKeySelective(tOrder);
    }

    @Override
    public int addOrder(TOrder tOrder) {
        return tOrderDAO.insertSelective(tOrder);
    }

    @Override
    public int deleteOrder(long id) {
        return tOrderDAO.deleteByPrimaryKey(id);
    }

    @Override
    public List<TOrder> findOrder(long name) {
        List<TOrder> list = new ArrayList<TOrder>();
        list.add(tOrderDAO.selectByPrimaryKey(name));
        return list;
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