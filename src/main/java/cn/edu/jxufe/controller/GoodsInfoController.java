package cn.edu.jxufe.controller;

import cn.edu.jxufe.entity.TGoods;
import cn.edu.jxufe.service.GoodsInfoServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by 26708 on 2018/8/7.
 */
@Controller
public class GoodsInfoController {
//    @InitBinder
//    public void initBinder(WebDataBinder binder) {
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        dateFormat.setLenient(false);
//        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
//
//    }
    @Autowired
    private GoodsInfoServer goodsInfoServer;

    @RequestMapping("goodsdate")
    @ResponseBody
    public Object tsetGoodinfo(@RequestParam(name = "page",defaultValue ="1") int page,@RequestParam(name = "rows",defaultValue ="20") int rows ,@RequestParam(name = "name",defaultValue ="-999") Integer name){
        System.out.println(page);
        System.out.println(rows);
        try {

                return goodsInfoServer.findAllGoods(page, rows,name);


        }catch (Exception e){
            e.printStackTrace();
            return "{errmsg:"+e.getMessage()+"}";

        }

    }
    @RequestMapping("goodsupdate")
       @ResponseBody
       public Object updateGoodinfo(TGoods tGoods){
        System.out.println("调用了更新数据");
        try {
            return goodsInfoServer.updateGoods(tGoods);
        }catch (Exception e){
            e.printStackTrace();
            return "{errmsg:"+e.getMessage()+"}";

        }

    }
    @RequestMapping("goodssave")
    @ResponseBody
    public Object saveGoodinfo(TGoods tGoods){
        System.out.println("调用了更新数据");
        try {
            return goodsInfoServer.addGoods(tGoods);
        }catch (Exception e){
            e.printStackTrace();
            return "{errmsg:"+e.getMessage()+"}";

        }

    }
    @RequestMapping("goodsdelete")
    @ResponseBody
    public Object deleteGoodinfo(int id){
        System.out.println("调用了更新数据");
        try {
            return goodsInfoServer.deleteGoods(id);
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