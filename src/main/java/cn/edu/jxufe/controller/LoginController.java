package cn.edu.jxufe.controller;

import cn.edu.jxufe.dao.TUserinfoDAO;
import cn.edu.jxufe.entity.TUserinfo;
import cn.edu.jxufe.entity.UserInfo;
import cn.edu.jxufe.service.GoodsInfoServer;
import cn.edu.jxufe.service.UserInfoServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author ${user}
 * @Date 2018/8/15.
 * @thisprojece YQC
 * @Description github:https://github.com/CapricomYang
 */
@Controller
public class LoginController {
    @Autowired
    private TUserinfoDAO tUserinfoDAO;

    @RequestMapping("logindata")
    public String loginTest(@RequestParam(name = "tel", defaultValue = "none") String tel, @RequestParam(name = "pwd", defaultValue = "none") String pwd, ModelMap map) {
//        public String Toindex(@PathVariable(value = "path") String path){
//            return  path;
//        }
        System.out.println(tel + "dsd");
        try {
            TUserinfo u = tUserinfoDAO.selectByPrimaryKey(tel);

            if (u == null) {

                return "loading";
            } else {
                if (u.getPassword().equals(pwd))
                    return "m_goods";
                else
                    return "loading";
            }

        } catch (Exception e) {
            e.printStackTrace();
            return "{errmsg:" + e.getMessage() + "}";
        }
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