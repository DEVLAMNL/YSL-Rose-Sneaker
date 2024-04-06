window.inchoiceController = function ($scope, $http) {
    $scope.index = 0;
    $scope.listInchoice = [];
    $scope.orderCurrent = {}

    //product
    const api = 'http://localhost:1235/rest/product/getAll';

    // Hàm để tải dữ liệu inchoice từ máy chủ
    function fetchInchoiceData() {
        const inchoiceApi = "http://localhost:1235/inchoice/Data";
        $http.get(inchoiceApi).then(function(res){
            $scope.listInchoice = res.data;
        });
    }

    const fetchProducts = () => {
        $http.get(api).then(function (res) {
            $scope.listProduct = res.data
        })
    }

    // Gọi hàm tải dữ liệu khi controller được khởi tạo
    fetchInchoiceData();

    // Hàm để tạo mới inchoice
    $scope.createInchoice = function () {
        var currentDate = new Date();
        var inchoice ={
            ngaytao : currentDate,
            maHD: "HD" + $scope.index,
            trangthai : 0
        };

        const api = "http://localhost:1235/inchoice/createInchoice";
        $http.post(api, inchoice).then(function(res){
            $scope.index++;
            // Sau khi thêm thành công, tải dữ liệu mới và cập nhật màn hình
            fetchInchoiceData();
        });
    };

    $scope.chooseProduct = () => {
        fetchProducts()
    }

    $scope.chooseBillWait = (bill) => {
        console.log(bill)
        $scope.orderCurrent = bill;
    }

    $scope.addTocart = function (productId) {
        if (productId) {
            const api = "http://localhost:1235/DetailCart/add";
            axios.post(api + "?productId=" + productId + "&orderID=" + $scope.orderCurrent.idhd).then(function (res) {
                // Xử lý phản hồi từ server nếu cần
                console.log("Thêm sản phẩm vào giỏ hàng thành công");
            }).catch(function (error) {
                console.error("Đã xảy ra lỗi khi thêm sản phẩm vào giỏ hàng:", error);
            });
        };
    }
    
};
