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
    <link href="https://cdn.bootcss.com/twitter-bootstrap/3.0.1/css/bootstrap.css" rel="stylesheet">
    <script src="http://libs.baidu.com/jquery/2.1.4/jquery.min.js"></script>
    <script src="https://cdn.bootcss.com/twitter-bootstrap/3.0.1/js/bootstrap.min.js"></script>

    <script src="https://cdn.staticfile.org/angular.js/1.4.6/angular.min.js"></script>
    <script type="text/javascript">

        var app = angular.module('myApp', []);
        app.controller('H1Controller', function($scope,$http) {

            $scope.save=function () {
                if($scope.tbGrade.id!=null)
                    $scope.update();
                else
                    $scope.addTbGrade();

            }


           $scope.update=function () {
               $http.post("<%=basePath%>score/update.do",$scope.tbGrade).success(function (response) {
                   if(!response.result)
                       alert("修改失败！")
                   else
                       location.reload();

               })
           }
            $scope.getById=function (id) {
                $http.get("<%=basePath%>score/getOne/" + id + ".do", $scope.tbGrade).success(function (response) {
                    $scope.tbGrade = response;

                });
            }

            $scope.addTbGrade=function () {
                $http.post("<%=basePath%>score/addTbGrade.do",$scope.tbGrade).success(function (response) {
                    if(!response.result)
                        alert("添加失败！")
                    else
                        location.reload();
                })
            }

        });

        function  delete1(id) {
            $.get("<%=basePath%>score/delete/"+id+".do",function(data,status){
                if(!data.result)
                    alert("删除失败：原因 :"+data.message)
                else
                    location.reload();
            });
        }
    </script>
</head>
<body ng-app="myApp" ng-controller="H1Controller">
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="row clearfix">
                <div class="col-md-12 column">
                    <h3>
                       ${g.tbname}的课程信息
                    </h3>
                </div>
            </div>
            <button type="button" ng-click="tbGrade={};tbGrade.userid=${g.id}" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal">
                添加新课程
            </button>
            <div class="row clearfix">
                <div class="col-md-12 column">
                    <table class="table">
                        <thead>
                        <tr>
                            <th>
                                课程id
                            </th>
                            <th>
                                课程名
                            </th>
                            <th>
                                分数
                            </th>
                            <th>
                               删除
                            </th>
                            <th>
                                修改
                            </th>

                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach items="${g.grades}" var="item">
                            <tr >
                                <td>
                                        ${item.id}
                                </td>
                                <td>
                                        ${item.tbname}
                                </td>
                                <td>
                                        ${item.tbscore}
                                </td>
                                <td>
                                    <button  onclick="delete1(${item.id})" class="btn btn-success">删除此记录</button>
                                </td>
                                <td>
                                    <button type="button" ng-click="getById(${item.id})" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal">
                                        修改
                                    </button>
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
                    <h4 class="modal-title" id="myModalLabel" ng-if="tbGrade.id!=null">修改学生: ${g.tbname}课程信息</h4>
                    <h4 class="modal-title" id="myModalLabel" ng-if="tbGrade.id==null">添加学生: ${g.tbname}课程信息</h4>
                </div>
                <div class="modal-body">
                    <form class="form-horizontal">
                        <div class="form-group">
                            <label for="inputEmail3" class="col-sm-2 control-label">课程名</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" id="inputEmail3" placeholder="tbGrade.tbname" ng-model="tbGrade.tbname">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputPassword3" class="col-sm-2 control-label">分数</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" id="inputPassword3" placeholder="tbGrade.tbscore" ng-model="tbGrade.tbscore">
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

</body>
</html>
