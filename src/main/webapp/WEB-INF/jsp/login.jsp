<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/3/31
  Time: 10:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
    <link rel="stylesheet" type="text/css" href="easyui.css">
    <link rel="stylesheet" type="text/css" href="icon.css">
    <script type="text/javascript" src="jquery.min.js"></script>
    <script type="text/javascript" src="jquery.easyui.min.js"></script>
    <script type="text/javascript">
        $(function(){
            $('#login_submit').bind('click', function(){
                $('#login_form').form('submit', {
                    url:'login',
                    onSubmit: function(){
                        // do some check
                        // return false to prevent submit;
                        if($(":text:eq(0)").val()==""){
                            $.messager.alert('系统信息','用户名不能为空');
                            return false;
                        }else if($(":password:eq(0)").val()=="") {
                            $.messager.alert('系统信息','密码不能为空');
                            return false;
                        }
                    },
                    success:function(data){
                        if(data=="1"){
                            // $.messager.alert('系统信息','登录成功');
                            location.href="main.jsp";
                        }else {
                            $.messager.alert('系统信息','登录失败');
                        }
                    }
                });
            });
        });

    </script>
</head>
<body style="background-color: #70C3FF">
<div style="margin: 200px auto;width: 400px">
    <div id="p" class="easyui-panel" title="登录"
         style="width:400px;height:200px;padding:10px;background:#b5e9fa;"
         data-options="iconCls:'icon-login',closable:false,
                    collapsible:false,minimizable:false,maximizable:false">
        <form action="login" method="post" id="login_form">
            <table width="225" align="center">
                <tr>
                    <th colspan="2" style="text-align: center;font-size: 20px">管理系统</th>
                </tr>
                <tr style="height: 40px">
                    <td>登录名</td>
                    <td><input type="text" name="uname"></td>
                </tr>
                <tr style="height: 40px">
                    <td>密码</td>
                    <td><input type="password" name="pwd"></td>
                </tr>
                <tr>
                    <td colspan="2" align="right"><a id="login_submit" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-ok'">登录</a></td>
                </tr>
            </table>
        </form>
    </div>
</div>
</body>
</html>
