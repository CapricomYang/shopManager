package cn.edu.jxufe;

import cn.edu.jxufe.service.impl.WxServerImpl;
import cn.edu.jxufe.tool.NetTools;

import java.util.List;

/**
 * @Author ${user}
 * @Date 2018/8/17.
 * @thisprojece YQC
 * @Description github:https://github.com/CapricomYang
 */
public class TestWX {


    public static void main(String[] args) {
        WxServerImpl wxServer=new WxServerImpl();

        String accessToken = wxServer.getAccessToken();
        String url="https://api.weixin.qq.com/cgi-bin/message/custom/send?access_token="+accessToken;
        List<String> allUser = wxServer.getAllUser();
        for (String s:allUser){
            NetTools.postC(url,s);
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