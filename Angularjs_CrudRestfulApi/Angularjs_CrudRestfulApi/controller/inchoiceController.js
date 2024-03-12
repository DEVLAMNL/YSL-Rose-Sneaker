window.inchoiceController = function ($scope, $http) {
    var inchoice = {
        Date :new date,
    }   
    $scope.inchoiceData = function(){
        $http.get()
    }
    
    $scope.createInchoice = function () {
    const api = "http://localhost:1235/inchoice/createInchoice";
        $http.post(api,inchoice).then(function(res){
            console.log(inchoice.Date);

        })
    }
}