window.userController = function ($scope, $http) {
    $scope.DataUser = function () {
        const api = "http://localhost:1235/auth/DataUser";
        $http.get(api).then(function (res) {
            $scope.listUser = res.data
        })
    }
    $scope.DataUser();
    $scope.create = function () {
        const DataUrl = "http://localhost:1235/auth/create";
        $http.post(DataUrl, $scope.kh).then(function (res) {
        })
    }
    $scope.UserDto = function () {
        const user = "http://localhost:1235/auth/user-dto";
        $http.get(user).then(function (res) {
            $scope.dto = res.data;
        })
    }
    $scope.UserDto();
}
