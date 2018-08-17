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
          field: 'telphone', title: '电话号码', width: 100, align: 'center',
          editor: {type: "text", options: {required: true}}
        },
        {
          field: 'password', title: '密码', width: 80, align: 'left',
          editor: {type: "text", options: {required: true}}
        },
        {
          field: 'nickname', title: '用户名称', width: 80, align: 'center',
          editor: {type: "text", options: {required: true}}
        },
        {
          field: 'headimg', title: '用户头像', width: 130, align: 'center', formatter: function (v, r, i) {
          return "<img src=" + v + " height=20 />";
        },
          editor: {type: "text", options: {required: true}}
        },
        {
          field: 'createtime', title: '创建时间', width: 200, align: 'center',
          editor: {type: "text", options: {required: true}},
          formatter: function (v, r, i) {
            var d = new Date(v);
            return d.getFullYear() + "年" + (d.getMonth() + 1) + "月" + d.getDate() + "日" + d.getHours() + ":" + d.getMinutes() + ":" + d.getSeconds();
          }
        },
        {
          field: 'updatetime', title: '更新时间', width: 200, align: 'center',
          editor: {type: "text", options: {required: true}},
          formatter: function (v, r, i) {
            var d = new Date(v);
            return d.getFullYear() + "年" + (d.getMonth() + 1) + "月" + d.getDate() + "日" + d.getHours() + ":" + d.getMinutes() + ":" + d.getSeconds();
          }
        }

      ]],
      idField:"orderid",
      url:"orderdate",
      autoSave:true,
      pageList:[20, 40, 80,160],
      updateUrl:"orderupdate",
      destroyUrl:"orderdelete",
      saveUrl:"ordersave",
      title: "用户信息列表",
      toolbar: "#tb",
      ctrlSelect:true,
      selectOnCheck:true
    })
  })

  function selectGoodsByName(){
    $("#adv").edatagrid('load', {
      tel: $("input:text[name='searchGoodsByName']").val()



    })

  }
</script>


<div id="content" region="center" title="" style="padding:5px;">
  <table id="adv">

  </table>
  <div id="tb" style="background-color: lightblue;padding:10px 10px 10px 10px;">

    输入电话号码查询<input type="text" name="searchGoodsByName" />
    <a href="#" class="easyui-linkbutton" iconCls="icon-search" plain="true"
       onclick="selectGoodsByName()" style="background-color:honeydew;">搜索</a>
    <a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true"
       onclick="javascript:grid.edatagrid('addRow')"
       style="background-color:honeydew;">增加用户</a>

    <a href="#" class="easyui-linkbutton" iconCls="icon-remove" plain="true"
       onclick="javascript:grid.edatagrid('destroyRow')" style="background-color:honeydew;">删除用户</a>
<jsp:include page="tail.jsp"></jsp:include>

