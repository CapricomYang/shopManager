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
                    field: 'goodsid', title: 'ID', width: 50, align: 'center',
                    editor: {type: "text", options: {required: true}}
                },
                {
                    field: 'goodsname', title: '商品名称', width: 150, align: 'left',
                    editor: {type: "text", options: {required: true}}
                },
                {
                    field: 'originalprice', title: '商品市价', width: 80, align: 'center',
                    editor: {type: "text", options: {required: true}}
                },
                {
                    field: 'sellingprice', title: '商品售价', width: 80, align: 'center',
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
                    field: 'typeid', title: '商品类型', width: 100, align: 'center',
                    formatter: function (v, r, i) {
                        switch (v) {
                            case 1:
                                return "食品";
                                break;
                            case 2:
                                return "文具";
                                break;
                            default :
                                return "首饰";
                        }
                    },
                    editor: {type: 'numberbox', options: {required: true}}
                },

                {
                    field: 'img', title: '商品图片', width: 100, align: 'center', formatter: function (v, r, i) {
                    return "<img src=" + v + " height=20 />";
                },
                    editor: {type: "text", options: {required: true}}
                },

                {
                    field: 'description', title: '商品描述', width: 500, align: 'left',
                    editor: {type: "text", options: {required: true}}
                },

                {
                    field: 'edit', title: '保存修改', width: 80, align: 'center',
                    formatter: function () {
                        return "<a href=''>SAVE</a> ";
                    }
                }
            ]],
            url: "goodsdate",
            autoSave:true,
            pageList:[20, 40, 80,160],
            singleselect:true,
            updateUrl:"goodsupdate",
            destroyUrl:"goodsdelete",
            saveUrl:"goodssave",
            title: "商品列表",
            toolbar: "#tb"
//            onDestroy:function(index,row){
//                alert(row.msg);
//
//            },
//            onError: function(index,row){
//                alert();
//            }
//            ,

            // 在双击一个单元格的时候开始编辑并生成编辑器，然后定位到编辑器的输入框上
//            onDblClickCell: function (index, field, value) {
//                $(this).datagrid('beginEdit', index);
//                var ed = $(this).datagrid('getEditor', {index: index, field: field});
//                $(ed.target).focus();
//            }


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

    </table>
    <div id="tb" style="background-color: lightblue;padding:10px 10px 10px 10px;">

        查询<input type="text" name="standard.minLength" id="qMinLength"/>
        <a href="#" class="easyui-linkbutton" iconCls="icon-search" plain="true"
           onclick="javascript:alert('search')" style="background-color:honeydew;">搜索</a>
        <a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true"
           onclick="javascript:grid.edatagrid('addRow')"
           style="background-color:honeydew;">增加商品</a>

        <a href="#" class="easyui-linkbutton" iconCls="icon-remove" plain="true"
           onclick="javascript:grid.edatagrid('destroyRow')" style="background-color:honeydew;">删除商品</a>


        <%--$(‘#withdrawBtn’).click(function(){--%>
        <%--var rows = $(‘#greenhouseEquipment’).datagrid('getSelections');//这里是用getSelections获取到选中的行的数据。--%>
        <%--var Ele = []//新建一个空的数组--%>
        <%--for(i=0;i<rows.length;i++){//循环，把行的数组拆分。--%>
        <%--Ele.push(rows[i]);//把拆分好的数据用push的方法保存到数组Ele中。--%>
        <%--}--%>
        <%--for(j=0;j<Ele.length;j++){--%>
        <%--var index = $(‘#greenhouseEquipment’).datagrid('getRowIndex',Ele[j])//循环Ele里面的数据，根据几条数据（几行）获取到对应数量的索引。--%>
        <%--$(‘#greenhouseEquipment’).datagrid('deleteRow',index)//根据索引删除对应的行。--%>
        <%--$(‘#inventoryEquipment’).datagrid('insertRow',{//在右边插入新行。--%>
        <%--index : 0,--%>
        <%--row : {--%>
        <%--name : Ele[j].name--%>
        <%--}--%>
        <%--})--%>
        <%--}--%>





        <a href="#" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="javascript:grid.edatagrid('saveRow')"
           style="background-color:honeydew;">保存修改</a>
    </div>

</div>
<jsp:include page="tail.jsp"></jsp:include>

