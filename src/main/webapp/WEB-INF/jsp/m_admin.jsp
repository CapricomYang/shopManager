<%--
  Created by IntelliJ IDEA.
  User: 26708
  Date: 2018/8/7
  Time: 13:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="head.jsp"></jsp:include>
<script>
  var grid;
  $(function () {
    grid = $("#adv").edatagrid({
      fit: true,
      pagination: true,
      columns: [[
        {field: 'a', title: 'select', width: 100, align: 'center', checkbox: true},
        {
          field: 'id', title: '管理员ID', width: 100, align: 'center',
        editor: {type: "text", options: {required: true}}

        },
        {
          field: 'password', title: '管理员密码', width: 80, align: 'left',
          editor: {type: "text", options: {required: true}}
        },
        {
          field: 'issuper', title: '是否是超级管理员', width: 80, align: 'center'
          ,editor: {type: "text", options: {required: true}}

        },
        {
          field: 'createtime', title: '创建时间', width: 200, align: 'center',


          formatter: function (v, r, i) {
            var d = new Date(v);
            return d.getFullYear() + "年" + (d.getMonth() + 1) + "月" + d.getDate() + "日" + d.getHours() + ":" + d.getMinutes() + ":" + d.getSeconds();
          }
        },
        {
          field: 'updatetime', title: '更新时间', width: 200, align: 'center',

          formatter: function (v, r, i) {
            var d = new Date(v);
            return d.getFullYear() + "年" + (d.getMonth() + 1) + "月" + d.getDate() + "日" + d.getHours() + ":" + d.getMinutes() + ":" + d.getSeconds();
          }
        }

      ]],
      idField:"id",
      url: "admininfo",
      updateUrl:"updateadmininfo",
      autoSave:true,
      pageList:[20, 40, 80,160],
      title: "用户信息列表",
      ctrlSelect:true,
      selectOnCheck:true
    })
  })

</script>
<div id="content" region="center" title="" style="padding:5px;">
  <table id="adv">
  </table>
</div>


<div id="buttom" region="south" title="" style="padding:2px;width: 100%; height: 30px;text-align: center;background-color: lightgray">
  合众艾特-江财4班-杨庆超
</div>
</div>

</body>
</html>
