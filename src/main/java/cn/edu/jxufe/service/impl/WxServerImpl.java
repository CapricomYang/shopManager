package cn.edu.jxufe.service.impl;

import cn.edu.jxufe.service.WxServer;
import cn.edu.jxufe.tool.NetTools;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author ${user}
 * @Date 2018/8/17.
 * @thisprojece YQC
 * @Description github:https://github.com/CapricomYang
 */
@Service
public class WxServerImpl implements WxServer{
    @Override
    public void sendImgTextMSGToALL(String jsonStr) {
        String url = "https://api.weixin.qq.com/cgi-bin/message/custom/send?access_token=ACCESS_TOKEN";
        url = url.replace("ACCESS_TOKEN", this.getAccessToken());
        List<String> list = this.getAllUser();
        for (int i = 0; i < list.size(); i++) {
            String tmp = jsonStr;
            tmp = tmp.replace("OPENID", list.get(i));
            //String rs = NetTools.postC(url);
            //System.out.println(rs);
        }
    }

    @Override
    public String getAccessToken() {
        String accessToken = "";
        String url = "http://111.230.223.115/wx/accesstoken/get";
        String rs = NetTools.getC(url);
        if (rs != null) {
            JSONObject jsonObject = JSON.parseObject(rs);
            if (jsonObject.containsKey("accessToken")) {
                accessToken = jsonObject.getString("accessToken");
            }
        }
        return accessToken;
    }

    @Override
    public List<String> getAllUser() {
        List<String> list = new ArrayList<String>();
        String url = "https://api.weixin.qq.com/cgi-bin/user/get?access_token=ACCESS_TOKEN";
        url = url.replace("ACCESS_TOKEN", this.getAccessToken());
        String rs = NetTools.getC(url);
        if (rs != null) {
            JSONObject jsonObject = JSON.parseObject(rs);
            if (jsonObject.containsKey("data")) {
                jsonObject = jsonObject.getJSONObject("data");
                JSONArray jsonArray = jsonObject.getJSONArray("openid");
                for (int i = 0; i < jsonArray.size(); i++) {
                    list.add(jsonArray.getString(i));
                }
            }
        }
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