package cn.edu.jxufe.service.impl;

import cn.edu.jxufe.dao.TAdminDAO;
import cn.edu.jxufe.entity.TAdmin;
import cn.edu.jxufe.service.AdminInfoServer;
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
public class AdminInfoServerImpl implements AdminInfoServer {

    @Autowired
    private TAdminDAO tAdminDAO;
    @Override
    public List<TAdmin> findAllAdmin() {
        return tAdminDAO.findAllAdmin();
    }

    @Override
    public Map findAllAdminInfo(int page, int rows, int id) {
        if (id==-999) {
            System.out.println("查询所有了！");
            PageHelper.startPage(page, rows);
            PageInfo pageInfo = new PageInfo(tAdminDAO.findAllAdmin());

            Map map = new HashMap<Object, Object>();
            map.put("total", pageInfo.getTotal());
            map.put("rows", pageInfo.getList());
            return map;
        } else {
            PageHelper.startPage(page, rows);
            PageInfo pageInfo = new PageInfo(this.findTAdmin(id));

            Map map = new HashMap<Object, Object>();
            map.put("total", pageInfo.getTotal());
            map.put("rows", pageInfo.getList());
            return map;
        }
    }

    @Override
    public int updateTAdmin(TAdmin tAdmin) {
        return tAdminDAO.updateByPrimaryKeySelective(tAdmin);
    }

    @Override
    public int addTAdmin(TAdmin tAdmin) {
        return tAdminDAO.insertSelective(tAdmin);
    }

    @Override
    public int deleteTAdmin(int id) {
        return tAdminDAO.deleteByPrimaryKey(id);
    }

    @Override
    public List<TAdmin> findTAdmin(int id) {
        List<TAdmin> list = new ArrayList<TAdmin>();
        list.add(tAdminDAO.selectByPrimaryKey(id));
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