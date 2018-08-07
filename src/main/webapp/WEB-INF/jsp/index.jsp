<%--
  Created by IntelliJ IDEA.
  User: 26708
  Date: 2018/8/7
  Time: 13:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>饰品专卖管理界面</title>
  <link rel="stylesheet" type="text/css" href="easyui/themes/default/easyui.css">
  <link rel="stylesheet" type="text/css" href="easyui/themes/icon.css">
  <script type="text/javascript" src="easyui/js/jquery-1.4.4.min.js"></script>
  <script type="text/javascript" src="easyui/js/jquery.easyui.min.js"></script>
</head>
<body>
<div class="easyui-layout" style="width:100%;height:100%;">
  <div region="north" split="true" title="" style="width:100%;height:80px;">
<h1>饰品专卖后台管理</h1>
  </div>
  <div region="west" split="true" title="管理模块" style="width:150px;">
    <ul class="easyui-tree" style="font-size: 24px;">
      <li>
        <span>饰品专卖管理</span>
        <ul>
          <li><span>商品管理</span></li>
          <li><span>会员管理</span></li>
          <li><span>类别管理</span></li>
          <li><span>订单管理</span></li>
        </ul>
      </li>

      <li>
        <span>文本信息管理</span>
        <ul>
          <li><span>文章管理</span></li>
          <li><span>评论管理</span></li>
          <li><span>广告管理</span></li>
        </ul>
      </li>
    </ul>
  </div>

  <div id="content" region="center" title="" style="padding:5px;">
  </div>
</div>
</body>
</html>
