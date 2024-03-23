window.cartController = function ($http, $scope, $routeParams) {
    $scope.Cart = function () {
        const CartApi = "http://localhost:1235/DetailCart/listCart";
        $http.get(CartApi).then(function (res) {
            $scope.listCart = res.data;
        });
    };
    
    $scope.Cart();

};
