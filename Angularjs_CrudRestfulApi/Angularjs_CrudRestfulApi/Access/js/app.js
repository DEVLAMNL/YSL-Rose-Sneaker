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
        .when('/khachhang/add',{
            templateUrl: "/admin/user/addUser.html",
            controller: userController
        })
        .when('/inchoice',{
            templateUrl: "/admin/inchoice/sales at the counter.html",
            controller : inchoiceController
        })
        .when('/inchoice-listInchoice',{
            templateUrl: "/admin/sale_at_counter/listInchoice.html",
            controller : inchoiceController
        })
       
})