package cn.edu.jxufe.controller;
import cn.edu.jxufe.entity.TUserinfo;
import cn.edu.jxufe.service.UserInfoServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author ${user}
 * @Date 2018/8/12.
 * @thisprojece YQC
 * @Description github:https://github.com/CapricomYang
 */
@Controller
public class UserInfoController {
    @Autowired
    private UserInfoServer userInfoServer;
    @RequestMapping("userdate")
    @ResponseBody
    public Object tsetGoodinfo(@RequestParam(name = "page",defaultValue ="1") int page,@RequestParam(name = "rows",defaultValue ="20") int rows ,@RequestParam(name = "tel",defaultValue ="none") String tel){
        System.out.println(page);
        System.out.println(rows);
        try {
            return userInfoServer.findAllTUserinfo(page, rows, tel);
        }catch (Exception e){
            e.printStackTrace();
            return "{errmsg:"+e.getMessage()+"}";
        }
    }
    @RequestMapping("userupdate")
    @ResponseBody
    public Object updateUserinfo(TUserinfo tTUserinfo){
        System.out.println("调用了更新数据");
        try {
            return userInfoServer.updateTUserinfo(tTUserinfo);
        }catch (Exception e){
            e.printStackTrace();
            return "{errmsg:"+e.getMessage()+"}";
        }
    }
    @RequestMapping("usersave")
    @ResponseBody
    public Object saveUserinfo(TUserinfo tTUserinfo){
        System.out.println("调用了更新数据");
        try {
            return userInfoServer.addTUserinfo(tTUserinfo);
        }catch (Exception e){
            e.printStackTrace();
            return "{errmsg:"+e.getMessage()+"}";
        }
    }
    @RequestMapping("userdelete")
    @ResponseBody
    public Object deleteUserinfo(String id){
        System.out.println("调用了更新数据");
        try {
            return userInfoServer.deleteTUserinfo(id);
        }catch (Exception e){
            e.printStackTrace();
            return "{errmsg:"+e.getMessage()+"}";
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