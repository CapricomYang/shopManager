package cn.edu.jxufe.controller;

import cn.edu.jxufe.entity.TOrder;
import cn.edu.jxufe.service.OrderInfoServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author ${user}
 * @Date 2018/8/17.
 * @thisprojece YQC
 * @Description github:https://github.com/CapricomYang
 */
@Controller
public class OrderInfoController {
    @Autowired
    private OrderInfoServer orderInfoServer;
    @RequestMapping("orderdate")
    @ResponseBody
    public Object tsetGoodinfo(@RequestParam(name = "page",defaultValue ="1") int page,@RequestParam(name = "rows",defaultValue ="20") int rows ,@RequestParam(name = "name",defaultValue ="-999") long name){
        System.out.println(page);
        System.out.println(rows);
        try {
            return orderInfoServer.findAllOrder(page, rows, name);
        }catch (Exception e){
            e.printStackTrace();
            return "{errmsg:"+e.getMessage()+"}";
        }
    }


    @RequestMapping("orderupdate")
    @ResponseBody
    public Object updateAdminPassword(TOrder tOrder){
        System.out.println("调用了更新数据");
        try {
            return orderInfoServer.updateOrder(tOrder);
        }catch (Exception e){
            e.printStackTrace();
            return "{errmsg:"+e.getMessage()+"}";
        }
    }


    @RequestMapping("ordersave")
    @ResponseBody
    public Object saveGoodinfo(TOrder tGoods){
        System.out.println("调用了更新数据");
        try {
            return orderInfoServer.addOrder(tGoods);
        }catch (Exception e){
            e.printStackTrace();
            return "{errmsg:"+e.getMessage()+"}";
        }
    }
    @RequestMapping("orderdelete")
    @ResponseBody
    public Object deleteGoodinfo(long id){
        System.out.println("调用了更新订单");
        try {
            System.out.println("orserupdate!!!!!!!!!!!!!!");
            return orderInfoServer.deleteOrder(id);
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