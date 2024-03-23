window.inchoiceController = function ($scope, $http) {
    $scope.index = 0;
    $scope.listInchoice = [];

    // Hàm để tải dữ liệu inchoice từ máy chủ
    function fetchInchoiceData() {
        const inchoiceApi = "http://localhost:1235/inchoice/Data";
        $http.get(inchoiceApi).then(function(res){
            $scope.listInchoice = res.data;
        });
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
    
};
