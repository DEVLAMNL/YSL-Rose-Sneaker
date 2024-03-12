window.customerController = function ($scope, $http, $routeParams) {
    $scope.id = $routeParams.id;
    const api = 'http://localhost:1235/rest/product/getAll';
    $scope.getdata = function () {
        $http.get(api).then(function (res) {
            $scope.listProduct = res.data
        })
    }
    $scope.getdata();
    $scope.detail = function () {
        const apiUrl = 'http://localhost:1235/rest/product';
        if ($scope.id) {
            $http.get(`${apiUrl}/${$scope.id}`).then(function (res) {
                $scope.new = res.data;
            });
        }
    };
    $scope.detail();
}