var myApp = angular.module('myApp', ['ngRoute']);

myApp.config(function ($routeProvider) {
    $routeProvider
        .when('/product-list', {
            templateUrl: "/admin/product/list.html",
            controller: productsController
        })
        .when('/product-edit/:id', {
            templateUrl: "/admin/product/edit.html",
            controller: productsController
        })
        .when('/product-add', {
            templateUrl: "/admin/product/viewadd.html",
            controller: productsController
        })
        .when('/login', {
            templateUrl: "/login.html",
            controller: logincontroller
        })
        .when('/register',{
            templateUrl: "/register.html",
            controller: logincontroller
        })
        .when('/search/:ten',{
            templateUrl: "/admin/product/list.html",
            controller: productsController
        }).when('/khachhang',{
            templateUrl: "/admin/user/listUser.html",
            controller: userController
        })
       
})