window.inchoiceController = function ($scope, $http) {

    $scope.index = 0;
    $scope.listInchoice = [];
    $scope.orderCurrent = {}


    function fetchInchoiceData() {
        const inchoiceApi = "http://localhost:1235/inchoice/Data";
        $http.get(inchoiceApi).then(function (res) {
            $scope.listInchoice = res.data;
        });
    }

    const fetchProducts = () => {
        const api = 'http://localhost:1235/rest/product/getAll';
        $http.get(api).then(function (res) {
            $scope.listProduct = res.data
        })
    }

    fetchInchoiceData();

    $scope.createInchoice = function () {
        var currentDate = new Date();
        var inchoice = {
            ngaytao: currentDate,
            maHD: "HD" + $scope.index,
            trangthai: 0
        };

        const api = "http://localhost:1235/inchoice/createInchoice";
        $http.post(api, inchoice).then(function (res) {
            $scope.index++;
            fetchInchoiceData();
        });
    };

    $scope.chooseProduct = () => {
        fetchProducts();
    }

    $scope.chooseBillWait = (bill) => {
        console.log(bill)
        $scope.orderCurrent = bill;
    }

    $scope.addTocart = function (productId) {
        if (productId) {
            const api = "http://localhost:1235/DetailCart/add";
            axios.post(api + "?productId=" + productId + "&orderID=" + $scope.orderCurrent.idhd).then(function (res) {
                console.log("Thêm sản phẩm vào giỏ hàng thành công");
            }).catch(function (error) {
                console.error("Đã xảy ra lỗi khi thêm sản phẩm vào giỏ hàng:", error);
            });
        };
    }
    const getmaHD = (maHD) => {
        const api = 'http://localhost:1235/inchoice/';
        try {
            axios.get(`${api}/${maHD}`).then(function (res) {
                $scope.InchoiceAsmaHD = res.data;
                console.log($scope.InchoiceAsmaHD); 
            }).catch(function (error) {
                console.log(error); 
            });
        } catch (error) {
            console.log(error); 
        }
    };
    

};
