<%--
  Created by IntelliJ IDEA.
  User: 26708
  Date: 2018/8/7
  Time: 13:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<a href="#" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="$('#win').window('open');"
   style="background-color:honeydew;">上传图片</a>
</div>

<div id="win" class="easyui-window" title="上传图片" style="width:400px;height:200px ;font-family:'华文楷体';font-size: 16px;line-height: 40px; "
     data-options="iconCls:'icon-save',modal:true,closed:true">
  <form action="uploadimage" method="post" enctype="multipart/form-data">
    请选择文件：
    <input type="file" name="fs" style="width:300px;float: left;margin-left: 50px;">

    <input type="submit" name="s" value="点击上传" style="float: left;margin-left: 50px;margin-top: 20px;">
  </form>
</div>

</div>
<div id="buttom" region="south" title="" style="padding:2px;width: 100%; height: 30px;text-align: center;background-color: lightgray">
    合众艾特-江财4班-杨庆超
</div>
</div>

</body>
</html>