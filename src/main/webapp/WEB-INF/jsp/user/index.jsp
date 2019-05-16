<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">

    <title>管理界面</title>
    <link href="https://cdn.bootcss.com/twitter-bootstrap/3.0.1/css/bootstrap.css" rel="stylesheet">
    <script src="http://libs.baidu.com/jquery/2.1.4/jquery.min.js"></script>
    <script src="https://cdn.bootcss.com/twitter-bootstrap/3.0.1/js/bootstrap.min.js"></script>
    <script src="https://cdn.staticfile.org/angular.js/1.4.6/angular.min.js"></script>

    <script>

        function f(id) {

            $.get("<%=basePath%>delete/"+id+".do",function(data,status){
                if(!data.result)
                    alert("删除失败：原因 :"+data.message)
                else
                    location.reload();
            });

        }


        var app = angular.module('myApp', []);
        app.controller('indexController', function($scope,$http) {


            $scope.save=function () {
                if($scope.user.id!=null)
                    $scope.update();
                else
                    $scope.addUser();

            }


            $scope.update=function () {
                $http.post("<%=basePath%>user/updateUser.do",$scope.user).success(function (response) {
                    if(!response.result)
                        alert("修改失败！"+response.message)
                    else
                        location.reload();

                })
            }


            $scope.addUser=function () {
                $http.post("<%=basePath%>user/addUser.do",$scope.user).success(function (response) {
                    if(!response.result)
                        alert("添加失败！"+response.message)
                    else
                    location.reload();
                })
            }









        });



    </script>


    <!--
        <link rel="stylesheet" type="text/css" href="styles.css">
        -->
</head>
<body ng-app="myApp" ng-controller="indexController">

<div class="container-fluid" id="p1">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <nav class="navbar navbar-default" role="navigation">

                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">

                    <ul class="nav navbar-nav navbar-right">

                        <li>
                            <p class="navbar-text">管理员：${user.tbname}你好！<p>
                        </li>
                        <li>
                            <a href="<%=basePath%>logout.do">注销</a>
                        </li>

                    </ul>
                </div>

            </nav>
            <div class="row clearfix">
                <div class="col-md-2 column">
                    <ul>

                        <li>
                            <a   ng-click="user=null;"  class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal">添加学生</a>
                        </li>

                    </ul>
                </div>
                <div class="col-md-10 column">
                    <table class="table">
                        <thead>
                        <tr>
                            <th>
                                用户id
                            </th>
                            <th>
                                用户名
                            </th>
                            <th>
                                性别
                            </th>
                            <th>
                             查看相关课程得分
                            </th>
                            <th>
                                修改
                            </th>
                            <th>
                              删除
                            </th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach items="${list}" var="item">
                            <tr >
                                <td>
                                        ${item.id}
                                </td>
                                <td>
                                        ${item.tbname}
                                </td>
                                <td>
                                        ${item.tbsex}
                                </td>
                                <td>
                                       <a href="<%=basePath%>see/${item.id}.do" class="btn btn-success">查看用户课程详情</a>
                                </td>
                                <td>
                                <button type="button"  ng-click="user={'tbname':'${item.tbname}','tbsex':'${item.tbsex}','id':${item.id},'password':'${item.password}'}" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal">
                                    修改
                                </button>
                                </td>
                                <td>
                                       <button  onclick="f(${item.id})" class="btn btn-success">删除此用户</button>
                                </td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>


                </div>
            </div>
        </div>
    </div>
    <!-- Modal -->
    <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title" id="myModalLabel" ng-if="user.id!=null">修改学生: {{user.tbname}}信息</h4>
                    <h4 class="modal-title" id="myModalLabel" ng-if="user.id==null">添加学生: {{user.tbname}}信息</h4>
                </div>
                <div class="modal-body">
                    <form class="form-horizontal">
                        <div class="form-group">
                            <label for="inputEmail3" class="col-sm-2 control-label">姓名</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" id="inputEmail3" ng-model="user.tbname" >
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputEmail3" class="col-sm-2 control-label">性别</label>
                            <div class="col-sm-10">
                            <select class="form-control" ng-model="user.tbsex">
                                <option>男</option>
                                <option>女</option>
                            </select>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inp2" class="col-sm-2 control-label">密码</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control"   ng-model="user.password">
                            </div>
                        </div>


                    </form>



                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                    <button type="button"  ng-click="save()" class="btn btn-primary">保存</button>
                </div>
            </div>
        </div>
    </div>
</div>

<div class="row clearfix  navbar-fixed-bottom">
    <div class="col-md-12 column">
        <p class="text-center">
            @pps版权所有
        </p>
    </div>
</div>
</div>
</body>
</html>
