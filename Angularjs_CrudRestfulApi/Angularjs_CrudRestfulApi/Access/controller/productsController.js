window.productsController = function ($scope, $http, $routeParams) {
    const api = 'http://localhost:1235/rest/product/getAll';
    $scope.id = $routeParams.id;
    $scope.noResults = true;
    //get all 
    $scope.getdata = function () {
        $http.get(api).then(function (res) {
            $scope.listProduct = res.data
        })
    }
    $scope.getdata();
    //add
    $scope.add = function () {
        $http.post('http://localhost:1235/rest/product/add', $scope.input)
            .then(function (response) {
                window.location.href = "#!/product-list/";
            })
    }
    // detail

    $scope.detail = function () {
        const apiUrl = 'http://localhost:1235/rest/product';
        if ($scope.id) {
            $http.get(`${apiUrl}/${$scope.id}`).then(function (res) {
                $scope.new = res.data;
            });
        }
    };
    $scope.detail();
    $scope.update = function () {
        const api = "http://localhost:1235/rest/product/update";
        $http.put(`${api}/${$scope.id}`, $scope.new).then(function () {
        })

    }
    $scope.delete = function (id) {
        const apidelete = "http://localhost:1235/rest/product/delete";
        $http.delete(`${apidelete}/${id}`).then(function () {
            window.location.href = "#!/product-list/";
            $scope.getData();
        })
    }
    $scope.searchName = function () {
        if ($scope.ten) {
            const api = "http://localhost:1235/rest/product/search";
            $http.get(`${api}/${$scope.ten}`).then(function (res) {
            })
        }
    }
}