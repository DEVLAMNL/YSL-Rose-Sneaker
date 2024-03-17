var customer = angular.module('customer', ['ngRoute']);

customer.config(function ($routeProvider) {
    $routeProvider
        .when('/trangchu', {
            templateUrl: '/User/client_user_sale/list_product.html',
            // templateUrl: "customer.html",
            controller : customerController
        })
        .when('/detail/:id',{
        templateUrl: "User/client_user_sale/detail_product.html",
        controller: customerController
        })
        .when('/giohang',{
            templateUrl:"User/client_user_sale/detail_product.html",
            controller: cartController
        })
        .otherwise({
            reducrectTo : 'Trangchu'
        })
})