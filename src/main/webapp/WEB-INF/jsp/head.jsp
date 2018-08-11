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
    <script type="text/javascript" src="easyui/js/jquery.edatagrid.js"></script>
</head>
<body>
<div class="easyui-layout" style="width:100%;height:100%;">
    <div region="north" split="true" title="" style="width:100%;height:80px;background-color:lightgoldenrodyellow;padding-left: 20px;">
        <h1>饰品专卖后台管理</h1>
    </div>
    <div region="west" split="true" title="管理模块" style="width:200px;">
        <ul class="easyui-tree" style="font-size: 24px;">
            <li>
                <span>饰品专卖管理</span>
                <ul>
                    <li><span><a href="m_goods"> 商品信息管理模块</a></span></li>
                    <li><span><a href="m_user"> 用户信息管理模块</a></span></li>
                    <li><span><a href="m_order"> 订单信息管理模块</a></span></li>
                    <li><span><a href="m_kind"> 类别信息管理模块</a></span></li>
                </ul>
            </li>

            <li>
                <span>文本信息管理</span>
                <ul>
                    <li><span><a href="m_article"> 文章信息管理模块</a></span></li>
                    <li><span><a href="m_comment"> 评论信息管理模块</a></span></li>
                    <li><span><a href="m_advertisement"> 广告信息管理模块</a></span></li>
                </ul>
            </li>
        </ul>
    </div>