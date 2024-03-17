window.inchoiceController = function ($scope, $http) {
    
    $scope.inchoiceData = function(){
        const inchoiceApi = "http://localhost:1235/inchoice/Data";
        $http.get(inchoiceApi).then(function(res){
            $scope.listInchoice = res.data
        })
    }
    $scope.inchoiceData();
    var currentDate = new Date();
    var inchoice ={
        ngaytao : currentDate
    }
    $scope.createInchoice = function () {
    const api = "http://localhost:1235/inchoice/createInchoice";
        $http.post(api,inchoice).then(function(res){
        
        })
    }
}