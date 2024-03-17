window.logincontroller = function ($scope, $http) {
    const api = "http://localhost:1235/auth/register";
    $scope.register = function () {
        $http.post(api,$scope.inputvalue).then(function () {
        })
    }
    const apilogin = "http://localhost:1235/auth/login";
    $scope.login = function () {
        $http.post(apilogin,$scope.inputvalue_login).then(function () {
        })
    }
}