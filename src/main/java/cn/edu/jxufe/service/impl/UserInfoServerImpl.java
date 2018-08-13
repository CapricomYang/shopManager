package cn.edu.jxufe.service.impl;

import cn.edu.jxufe.dao.TUserinfoDAO;
import cn.edu.jxufe.entity.TUserinfo;
import cn.edu.jxufe.service.UserInfoServer;
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
 * @Date 2018/8/12.
 * @thisprojece YQC
 * @Description github:https://github.com/CapricomYang
 */
@Service
public class UserInfoServerImpl implements UserInfoServer{
    @Autowired
    private TUserinfoDAO tUserinfoDAO;

    @Override
    public List<TUserinfo> findAllTUserinfo() {
        return tUserinfoDAO.findAllUser();
    }

    @Override
    public Map findAllTUserinfo(int page ,int rows,String tel) {
        if (tel.equals("none")) {
            PageHelper.startPage(page, rows);
            PageInfo pageInfo = new PageInfo(tUserinfoDAO.findAllUser());

            Map map = new HashMap<Object, Object>();
            map.put("total", pageInfo.getTotal());
            map.put("rows", pageInfo.getList());
            return map;


        } else {
            PageHelper.startPage(page, rows);
            PageInfo pageInfo = new PageInfo(this.findTUserinfo(tel));

            Map map = new HashMap<Object, Object>();
            map.put("total", pageInfo.getTotal());
            map.put("rows", pageInfo.getList());
            return map;
        }
    }
    @Override
    public int updateTUserinfo(TUserinfo tUserinfo) {
        return tUserinfoDAO.updateByPrimaryKey(tUserinfo);
    }

    @Override
    public int addTUserinfo(TUserinfo tUserinfo) {
        return tUserinfoDAO.insertSelective(tUserinfo);
    }

    @Override
    public int deleteTUserinfo(String tel) {
        return tUserinfoDAO.deleteByPrimaryKey(tel);
    }

    @Override
    public List<TUserinfo> findTUserinfo(String tel) {
        List<TUserinfo> list = new ArrayList<TUserinfo>();
        list.add(tUserinfoDAO.selectByPrimaryKey(tel));
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