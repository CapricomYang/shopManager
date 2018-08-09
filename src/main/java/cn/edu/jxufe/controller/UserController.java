package cn.edu.jxufe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.applet.resources.MsgAppletViewer;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 26708 on 2018/8/3.
 */

@Controller
public class UserController {

    @RequestMapping("{path}")
    public String Toindex(@PathVariable(value = "path") String path){
        return path;
    }

    @RequestMapping(value = "profile")
      public String test(ModelMap map){
        map.put("name","yqc");
        map.put("tel",123456);
        return "profile";

    }









    //    @RequestMapping("User")
//    @ResponseBody
//    public Object getUser(){
//        System.out.println("有一个请求来了");
//        Map map =new HashMap();
//        map.put("name","wuwenjie");
//        map.put("pwd","123");
//        return map;
//    }

//    @RequestMapping("Hello.html")
//    @ResponseBody
//    public Object getUser(Integer uid){
//        System.out.println("有一个请求来了，传入了一个参数"+uid);
//        System.out.println("调用业务类实现通过uid查询用户信息");
//        Map map = new HashMap();
//        map.put("uid",uid);
//        map.put("name","wuwenjie");
//        map.put("pwd","123");
//        return map;
//    }
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