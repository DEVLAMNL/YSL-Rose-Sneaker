package springboot.thi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springboot.thi.entity.giohang;
import springboot.thi.entity.product;
import springboot.thi.repo.cartRepo;

import java.util.List;

@RestController
@RequestMapping("/cart")
@CrossOrigin("*")
public class cartController {

    @Autowired
    private cartRepo cartRepo;

    @GetMapping("/data")
    public List<giohang> getAll() {
        return cartRepo.findAll();
    }
        @PostMapping("/addproduct")
        public ResponseEntity<?> save(@RequestBody product product ){
//        cartRepo.insertCart(c,product.getId());
        return new ResponseEntity<>(product, HttpStatus.CREATED);
        }
}
