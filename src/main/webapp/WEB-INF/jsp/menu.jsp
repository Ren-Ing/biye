<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/4/7 0007
  Time: 21:04
  To change this template use File | Settings | File Templates.
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <!-- 引入样式文件和动态控制 -->
<%--    <link href="<%=path %>bootstrap.min.css" rel="stylesheet">--%>
    <link href="bootstrap.min.css" rel="stylesheet">
<%--    <script src="jquery-3.2.1.min.js"></script>--%>
    <script src="jquery.min.js"></script>
    <script src="bootstrap.min.js"></script>
    <title>库存管理</title>
</head>
<body>
<nav class="navbar navbar-inverse" role="navigation">
    <div class="container-fluid">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#example-navbar-collapse">
                <span class="sr-only">切换导航</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">
                <img src="<%=path %>/images/a.jpg" height="100%" />
            </a>
        </div>
        <div class="collapse navbar-collapse" id="example-navbar-collapse">
            <ul class="nav navbar-nav">
                <li class="active"><a class="icon-bar" href="#">设置</a>
                </li>
                <li><a href="#">货物管理</a>
                </li>
                <li><a href="#">出入库管理</a>
                </li>
                <li><a href="#">用户管理</a>
                </li>
                <li><a href="#">订单管理</a>
                </li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li><a>欢迎您,admin</a>
                </li>
                <li><a href="#">安全退出</a>
                </li>
            </ul>
        </div>
    </div>
</nav>


<div class="container-fluid">
    <div class="row">
        <div class="col-sm-2">
            <a href="#" class="list-group-item active"><span class="glyphicon glyphicon-home"></span>首页
            </a>
            <a href="#" class="list-group-item">
                <!-- 小图标样式设置 -->
                <span class="glyphicon glyphicon-search" aria-hidden="true">
                    </span>库存信息查询</a>
            <a href="#" class="list-group-item">
                        <span class="glyphicon glyphicon-align-left" aria-hidden="true">
                    </span>货物出库</a>
            <a href="#" class="list-group-item">
                        <span class="glyphicon glyphicon-camera" aria-hidden="true">
                    </span>货物入库</a>
            <a href="#" class="list-group-item">
                        <span class="glyphicon glyphicon-plus" aria-hidden="true">
                    </span>用户管理</a>
            <a href="#" class="list-group-item">
                        <span class="glyphicon glyphicon-minus" aria-hidden="true">
                    </span>仓库管理</a>
            <a href="#" class="list-group-item">
                        <span class="glyphicon glyphicon-search" aria-hidden="true">
                    </span>供应商管理</a>
            <a href="#" class="list-group-item">
                        <span class="glyphicon glyphicon-user" aria-hidden="true">
                    </span>个人设置</a>z
        </div>
        <!--左边菜单栏-->
        <div class="col-sm-10">
            <ol class="breadcrumb">
                <li class="active">菜单
                </li>
                <li class="active">库存盘点
                </li>
            </ol>

            <div class="panel panel-default">
                <div class="panel-heading">
                    搜索
                </div>
                <div class="panel-body">
                    <form role="form" class="form-inline">
                        <div class="form-group">
                            <label for="name">名称</label>
                            <input type="text" class="form-control" id="name" placeholder="请输入名称">
                        </div>
                        <div class="form-group">
                            <label for="name">状态</label>
                            <select class="form-control">
                                <option>上架</option>
                                <option>下架</option>
                            </select>
                        </div>
                        <div class="form-group">
                            <button type="submit" class="btn btn-default">开始搜索</button>
                        </div>
                    </form>
                </div>
            </div>
            <!--
                列表展示
            -->
            <div class="table-responsive">
                <table class="table table-striped ">
                    <thead>
                    <tr>
                        <th>编号</th>
                        <th>名称</th>
                        <th>价格</th>
                        <th>数量</th>
                        <th>仓库号</th>
<%--                        <th>状态</th>--%>
<%--                        <th>操作</th>--%>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <td>15</td>
                        <td>
                            <img src="images/a.jpg" class="img-thumbnail" style="height: 30px;" />
                        </td>
                        <td>宝马</td>
                        <td>1800000.00￥</td>
                        <td>1800000.00￥</td>
                        <td>上架</td>
                        <td>
                            <div class="btn-group">
                                <a href="" class="btn btn-default">修改</a><a href="" class="btn btn-default">下架</a><a href="" class="btn btn-danger">删除</a>
                            </div>

                        </td>
                    </tr>

                    </tbody>
                </table>
            </div>
            <ul class="pagination" style="float: right;">
                <li><a href="#">&laquo;</a>
                </li>
                <li class="active"><a href="#">1</a>
                </li>
                <li class="disabled"><a href="#">2</a>
                </li>
                <li><a href="#">3</a>
                </li>
                <li><a href="#">4</a>
                </li>
                <li><a href="#">5</a>
                </li>
                <li><a href="#">&raquo;</a>
                </li>
            </ul>
        </div>
    </div>
</div>
<!-- 底部页脚部分 -->
<div class="footer">
    <p class="text-center">
        2021 &copy; SWUST.
    </p>
</div>
</body>
</html>



