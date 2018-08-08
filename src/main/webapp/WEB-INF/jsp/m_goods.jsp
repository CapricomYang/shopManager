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
      columns:[[
        {field:'goodsname',title:'商品名称',width:100,align:'center'},
        {field:'description',title:'商品描述',width:100,align:'center'},
        {field:'originalprice',title:'商品市价',width:100,align:'center'},
        {field:'sellingprice',title:'商品售价',width:100,align:'center'}
      ]],
      url:"goodsdate"
    })
  })
</script>

<div id="content" region="center" title="" style="padding:5px;">
  <table id="adv">

  </table>

</div>
<jsp:include page="tail.jsp"></jsp:include>

