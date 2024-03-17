window.cartController = function ($http, $scope) {
    $scope.product = {
    }

    $scope.addTocart = function () {
        const api = "http://localhost:1235/cart/addproduct";
        $http.post(api, $scope.product).then(function (res) {

        })
    }
}