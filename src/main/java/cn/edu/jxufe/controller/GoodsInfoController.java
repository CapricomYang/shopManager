package cn.edu.jxufe.controller;

import cn.edu.jxufe.service.GoodsInfoServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 26708 on 2018/8/7.
 */
@Controller
public class GoodsInfoController {
    @Autowired
    private GoodsInfoServer goodsInfoServer;

    @RequestMapping("goodsdate")
    @ResponseBody
    public Object tsetGoodinfo(@RequestParam(name = "page",defaultValue ="1") int page,@RequestParam(name = "rows",defaultValue ="10") int rows ){
        System.out.println(page);
        System.out.println(rows);
        try {
            return goodsInfoServer.findAllGoods(page, rows);
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