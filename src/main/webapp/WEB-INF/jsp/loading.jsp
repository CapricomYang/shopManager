<%--
  Created by IntelliJ IDEA.
  User: 26708
  Date: 2018/8/15
  Time: 13:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="zh">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>登录</title>
    <link rel="stylesheet" type="text/css" href="css/styles.css">
</head>
<body>

<div class="htmleaf-container">
    <div class="wrapper">
        <div class="container">
            <h1>Welcome</h1>

            <form id="ff" class="form" method="post" action="/logindata">
                <input class="easyui-validatebox" type="text" placeholder="Username" name="tel"
                       data-options="required:true">
                <input class="easyui-validatebox" type="password" placeholder="Password" name="pwd">
                <button id="login-button" onclick="sub()">Login</button>
            </form>
        </div>


        <script>
            function sub() {
                $('#ff').form("submit", {
                    url: '/logindata',
                    onSubmit: function () {
                        return true;
                    },
                    success: function (data) {
                        alert(data)
                    }
                });
            }

        </script>
        <%--<script src="js/jquery-2.1.1.min.js" type="text/javascript"></script>--%>
        <%--<script>--%>
            <%--$('#login-button').click(function (event) {--%>
                <%--sub();--%>
            <%--});--%>
        <%--</script>--%>

        <ul class="bg-bubbles">
            <li></li>
            <li></li>
            <li></li>
            <li></li>
            <li></li>
            <li></li>
            <li></li>
            <li></li>
            <li></li>
            <li></li>
        </ul>
    </div>
</div>



<div style="text-align:center;margin:50px 0; font:normal 14px/24px 'MicroSoft YaHei';color:#000000">
    <h1>后台数据管理</h1>
</div>
</body>
</html>
