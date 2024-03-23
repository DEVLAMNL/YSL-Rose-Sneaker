package springboot.thi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springboot.thi.entity.giohangchitiet;
import springboot.thi.entity.hoadon;
import springboot.thi.entity.product;
import springboot.thi.repo.cartDeatailsRepo;
import springboot.thi.repo.productRepo;

import java.util.List;

@RestController
@RequestMapping("/DetailCart")
@CrossOrigin("*")
public class detailCartController {

    @Autowired
    private cartDeatailsRepo cartDeatailsRepo;

//    @Autowired
//    private productRepo productRepo;

    @GetMapping("/listCart")
    public List<giohangchitiet> listDetailCart() {
        return cartDeatailsRepo.findAll();
    }

    @PostMapping("/add/{productId}")
    public ResponseEntity<String> addToCart(@PathVariable("productId") Integer productId) {
        giohangchitiet ghct = new giohangchitiet();
        ghct.setId_sanpham(productId);
        cartDeatailsRepo.save(ghct);
        return ResponseEntity.ok("Thêm vào giỏ hàng thành công!");
    }

}
