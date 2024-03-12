window.userController = function ($scope, $http) {
    $scope.DataUser = function () {
        const api = "http://localhost:1235/auth/DataUser";
        $http.get(api).then(function(res){
            $scope.listUser = res.data
        })
    }
    $scope.DataUser();
}
