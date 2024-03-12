window.cartController = function ($http, $scope) {
    $scope.product = {
        id_gh: 1,
        id_sp: 1,
        ten: "BAE",
    }

    $scope.addTocart = function () {

        const api = "http://localhost:1235/cart/addproduct";
        $http.post(api, $scope.product).then(function (res) {

        })
    }
}