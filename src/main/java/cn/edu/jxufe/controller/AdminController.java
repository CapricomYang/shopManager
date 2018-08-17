package cn.edu.jxufe.controller;

import cn.edu.jxufe.entity.TAdmin;
import cn.edu.jxufe.service.AdminInfoServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @Author ${user}
 * @Date 2018/8/17.
 * @thisprojece YQC
 * @Description github:https://github.com/CapricomYang
 */@Controller
public class AdminController {
    @Autowired
    private AdminInfoServer adminInfoServer;
    @RequestMapping("admindate")
    @ResponseBody
    public Object admininfo(@RequestParam(name = "page",defaultValue ="1") int page,@RequestParam(name = "rows",defaultValue ="20") int rows ,@RequestParam(name ="id",defaultValue ="-999") int id){
        System.out.println(page);
        System.out.println(rows);
        try {
            return adminInfoServer.findAllAdminInfo(page, rows, id);
        }catch (Exception e){
            e.printStackTrace();
            return "{errmsg:"+e.getMessage()+"}";
        }
    }

    @RequestMapping("admin")
    @ResponseBody
    public Object admin(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o){
        Object obj=httpServletRequest.getSession().getAttribute("loginuser");
        Integer id = (Integer)obj;
        try {
            return adminInfoServer.findTAdmin(id);
        }catch (Exception e){
            e.printStackTrace();
            return "{errmsg:"+e.getMessage()+"}";
        }
    }
    @RequestMapping("updateadmin")
    @ResponseBody
    public Object updateAdminPassword(TAdmin tAdmin){
        System.out.println("调用了更新数据");
        try {
            return adminInfoServer.updateTAdmin(tAdmin);
        }catch (Exception e){
            e.printStackTrace();
            return "{errmsg:"+e.getMessage()+"}";
        }
    }
    @RequestMapping("admininfo")
    @ResponseBody
    public Object admininfo(HttpServletRequest httpServletRequest, Object o){
        Object obj=httpServletRequest.getSession().getAttribute("loginuser");
        Integer id = (Integer)obj;
        try {
            return adminInfoServer.findTAdmin(id);
        }catch (Exception e){
            e.printStackTrace();
            return "{errmsg:"+e.getMessage()+"}";
        }
    }
    @RequestMapping("updateadmininfo")
    @ResponseBody
    public Object updateAdminPasswordinfo(HttpServletRequest httpServletRequest,TAdmin tAdmin){
        Object obj=httpServletRequest.getSession().getAttribute("loginuser");
        Integer id=(Integer)obj;
        if (id==0){
            System.out.println("调用了更新数据");
            try {
                return adminInfoServer.updateTAdmin(tAdmin);
            }catch (Exception e){
                e.printStackTrace();
                return "{errmsg:"+e.getMessage()+"}";
            }
        }else return "";

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