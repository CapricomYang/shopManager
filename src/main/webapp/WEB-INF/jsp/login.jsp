<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: 26708
  Date: 2018/8/15
  Time: 9:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>简洁版登录</title>
</head>
<body>

<form id="ff" method="post" action="/logindate">
    <div>
        <label for="name">Name:</label>
        <input class="easyui-validatebox" type="text" name="tel" data-options="required:true"/>
    </div>
    <div>
        <label for="pwd">pwd:</label>
        <input class="easyui-validatebox" type="text" name="pwd"/>
    </div>
    <button style="height: 30px;width: 50px;" onclick="sub()">登录</button>
</form>
<script>
        function sub() {
            $('#ff').form({
    //            url: '',
                onSubmit: function () {
                    return true;
                },
                success: function (data) {
                    alert(data)
                }
            });
        }

</script>

</body>
</html>
