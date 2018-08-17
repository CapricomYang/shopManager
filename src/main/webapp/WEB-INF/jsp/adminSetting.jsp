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
  $(function(){
    $('#dg').edatagrid({
      url:'datagrid_data.json',
      columns:[[
        {field:'id',title:'管理员id',width:100},
        {
          field: 'issuper', title: '管理员类别', width: 150, align: 'center',
          formatter: function (v, r, i) {
            switch (v) {
              case true:
                return "超级管理员";
                break;
              case false:
                return "普通管理员";
                break;
              default :
                return "？？？";
            }
          }

        },
        {field:'password',title:'密码',width:100,align:'right' ,editor: {type: "text", options: {required: true}}}
      ]],
      url:"admin",
      idField:"id",
      updateUrl:"updateadmin",
      toolbar: "#tb",
      ctrlSelect:true,
      autoSave:true,
      title:"修改密码"
    });


  })

</script>
<div id="content" region="center" title="" style="padding:5px;">

  <table id="dg"></table>
  <div id="tb" style="background-color: lightblue;padding:10px 0px 10px 10px;">
    <a href="#" class="easyui-linkbutton"  plain="true"
       onclick="selectGoodsByName()" style="background-color:honeydew;">双击表单进行密码修改</a>

    <a href="#" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="javascript:grid.edatagrid('saveRow')"
       style="background-color:honeydew;">保存修改</a>

  </div>

</div>
<div id="buttom" region="south" title="" style="padding:2px;width: 100%; height: 30px;text-align: center;background-color: lightgray">
  合众艾特-江财4班-杨庆超
</div>
</div>

</body>
</html>
