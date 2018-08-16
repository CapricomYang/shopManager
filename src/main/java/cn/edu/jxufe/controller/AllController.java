package cn.edu.jxufe.controller;
import com.aliyun.oss.OSSClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.UUID;

/**
 * @Author ${user}
 * @Date 2018/8/12.
 * @thisprojece YQC
 * @Description github:https://github.com/CapricomYang
 */
@Controller
public class AllController {
@RequestMapping("jsp_{path}")
    public String Toindex(@PathVariable(value = "path") String path){
    return  path;
}

@RequestMapping("uploadimage")
    @ResponseBody
    public Object uploadImage(@RequestParam("fs") MultipartFile f,HttpServletRequest req) {

    String rs ="-1";
    String endpoint = "http://oss-cn-beijing.aliyuncs.com";
// 阿里云主账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM账号进行API访问或日常运维，请登录 https://ram.console.aliyun.com 创建RAM账号。
    String accessKeyId = "LTAI98muHU0MBzqi";
    String accessKeySecret = "ulZlJQHRanJ1kHdxYVdUElW90OST7q";
// 创建OSSClient实例。
    OSSClient ossClient = new OSSClient(endpoint, accessKeyId, accessKeySecret);


    InputStream inputStream = null;
    if (!f.isEmpty()) {
        try {
            inputStream = f.getInputStream();
            String fileName=UUID.randomUUID().toString()+f.getOriginalFilename();
            ossClient.putObject("shoppingimage", fileName, inputStream);
            rs="https://shoppingimage.oss-cn-beijing.aliyuncs.com/"+fileName;


        } catch (Exception e) {
            e.printStackTrace();

        }finally {
            ossClient.shutdown();
        }
    }
    return "图片地址为:"+rs;

//
//    String path=req.getSession().getServletContext().getRealPath("upload/");
//    System.out.println("站点实际路径："+path);
//
//    String fileName=UUID.randomUUID().toString()+f.getOriginalFilename();

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