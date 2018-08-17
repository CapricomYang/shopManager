package cn.edu.jxufe.tool;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

/**
 * @Author ${user}
 * @Date 2018/8/14.
 * @thisprojece YQC
 * @Description github:https://github.com/CapricomYang
 */
public class NetTools {

    public static String getC(String url){
        HttpClient liulanqi= HttpClients.createDefault();
        HttpGet get= new HttpGet(url);
        HttpResponse response=null;
        try {
            response=liulanqi.execute(get);
            HttpEntity entity=response.getEntity();
            String responseTxt= EntityUtils.toString(entity, "UTF-8");
            System.out.println(responseTxt);
            return responseTxt;
        }catch (IOException e){
            e.printStackTrace();
            return "";
        }finally {
            get.releaseConnection();
        }
    }

    public static String postC(String url,String openid) {
        HttpClient client= HttpClients.createDefault();
        HttpPost post= new HttpPost(url);
        post.addHeader("content-type","application/json;charset=utf-8");
        String postjson="{\"touser\":\"OPENID\",\"msgtype\":\"news\",\"news\":{\"articles\":[{\"title\":\"Happy Day\",\"description\":\"Is Really A Happy Day\",\"url\":\"www.baidu.com\",\"picurl\":\"https://goss.veer.com/creative/vcg/veer/800water/veer-133331298.jpg\"},{\"title\":\"Happy Day\",\"description\":\"Is Really A Happy Day\",\"url\":\"www.kugou.com\",\"picurl\":\"https://goss.veer.com/creative/vcg/veer/800water/veer-133331298.jpg\"}]}}";
        postjson= postjson.replace("OPENID",openid);
        System.out.println(postjson);
        post.setEntity(new StringEntity(postjson,"UTF-8"));

        HttpResponse response=null;
        HttpEntity entity=null;
        try {
            response=client.execute(post);
            entity=response.getEntity();
            String txt= EntityUtils.toString(entity, "UTF-8");
            System.out.println(txt);
            return txt;
        }catch (IOException e){
            e.printStackTrace();
            return "";
        }finally {
            post.releaseConnection();
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