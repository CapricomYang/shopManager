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
    $("#adv").datagrid({
      fit:true,
      pagination:true,
      columns:[[
        {field:'a',title:'商品名称',width:100,align:'center',checkbox:true},

        {field:'goodsid',title:'ID',width:50,align:'center'},
        {field:'goodsname',title:'商品名称',width:150,align:'left'},

        {field:'originalprice',title:'商品市价',width:80,align:'center'},
        {field:'sellingprice',title:'商品售价',width:80,align:'center'},
        {field:'createtime',title:'创建时间',width:200,align:'center',formatter:function(v,r,i){
          var d=new Date(v);
          return d.getFullYear()+"年"+(d.getMonth()+1)+"月"+ d.getDate()+"日"+ d.getHours()+":"+ d.getMinutes()+":"+ d.getSeconds();
        }},
        {field:'typeid',title:'商品类型',width:100,align:'center',formatter:function(v,r,i){
          switch (v){
            case 1:return"食品";
            break;
            case 2:return"文具";
            break;
            case 3:return"首饰";
            break;
          }
        }},
        {field:'description',title:'商品描述',width:500,align:'left'}
      ]],
      url:"goodsdate",


      title:"商品列表",
        toolbar:"#tb"
//      toolbar: [
//
//        {
//        iconCls: 'icon-search',
//
//        text:"查询数据",
//        handler: function(){alert('查询按钮')}
//      },'-',{
//        iconCls: 'icon-add',
//        text:"添加数据",
//        handler: function(){alert('添加按钮')}
//      },'-',{
//        iconCls: 'icon-remove',
//        text:"删除数据",
//        handler: function(){alert('删除按钮')}
//
//      },'-', {
//        iconCls: 'icon-edit',
//        text: "更新数据",
//        handler: function () {alert('编辑按钮')}
//
//      }]

    })
  })
</script>

<div id="content" region="center" title="" style="padding:5px;">
  <table id="adv">

    <div id="tb" style="background-color: lightblue;padding:10px 10px 10px 10px;">

      查询<input type="text" name="standard.minLength" id="qMinLength"/>
      <a href="#" class="easyui-linkbutton" iconCls="icon-search" plain="true" onclick="javascript:alert('search')" style="background-color:honeydew;">搜索</a>
      <a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="javascript:alert('Add')"  style="background-color:honeydew;">增加商品</a>
      <a href="#" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="javascript:alert('remove')" style="background-color:honeydew;">删除商品</a>
      <a href="#" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="javascript:alert('edit')" style="background-color:honeydew;">编辑商品</a>
    </div>
    </div>
  </table>

</div>
<jsp:include page="tail.jsp"></jsp:include>

