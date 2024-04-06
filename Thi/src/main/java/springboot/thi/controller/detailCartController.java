package springboot.thi.controller;

import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springboot.thi.entity.giohangchitiet;
import springboot.thi.entity.hoadon;
import springboot.thi.entity.hoadonchitiet;
import springboot.thi.entity.product;
import springboot.thi.repo.HoaDonChiTietRepository;
import springboot.thi.repo.InchoiceRepo;
import springboot.thi.repo.cartDeatailsRepo;
import springboot.thi.repo.productRepo;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/DetailCart")
@CrossOrigin("*")
public class detailCartController {

    @Autowired
    private cartDeatailsRepo cartDeatailsRepo;

    @Autowired
    private InchoiceRepo hoaDonRepo;

    @Autowired
    private HoaDonChiTietRepository hoaDonChiTietRepository;

    @Autowired
    private productRepo productRepo;

//    @Autowired
//    private productRepo productRepo;

    @GetMapping("/listCart")
    public List<giohangchitiet> listDetailCart() {
        return cartDeatailsRepo.findAll();
    }

    @PostMapping("/add")
    public ResponseEntity<String> addToCart(@RequestParam("productId") Integer productId,
                                            @RequestParam("orderID") Integer orderID) {
        try{
            hoadon hd = hoaDonRepo.findById(orderID).orElseThrow();
            product product = productRepo.findById(productId).orElseThrow();
            List<hoadonchitiet> hdcts = hoaDonChiTietRepository.findBillDetailsByIdBillAndIdProduct(productId, orderID);

            if(hdcts.isEmpty()){
                hoadonchitiet hdct = new hoadonchitiet();
                hdct.setProduct(product);
                hdct.setSoluong(1);
                hdct.setHoadon(hd);
                hdct.setDongia(BigDecimal.valueOf(Long.valueOf(product.getGiaban())));
                hoaDonChiTietRepository.save(hdct);
            }else{
                hoadonchitiet hdct = hdcts.get(0);
                hdct.setProduct(product);
                hdct.setSoluong(hdct.getSoluong() + 1);
                hdct.setHoadon(hd);
                hdct.setDongia(BigDecimal.valueOf(Long.valueOf(product.getGiaban())));
                hoaDonChiTietRepository.save(hdct);
            }

            return ResponseEntity.ok("Thêm vào giỏ hàng thành công!");
        }catch (Exception ex){
            return new ResponseEntity<>("Không tìm thấy giỏ hàng nào :))", HttpStatus.BAD_REQUEST);
        }

    }

}
