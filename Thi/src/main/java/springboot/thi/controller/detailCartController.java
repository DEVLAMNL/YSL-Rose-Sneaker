package springboot.thi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springboot.thi.entity.giohangchitiet;
import springboot.thi.repo.cartDeatailsRepo;

import java.util.List;

@RestController
@RequestMapping("/DetailCart")
@CrossOrigin("*")
public class detailCartController {

    @Autowired
    private cartDeatailsRepo cartDeatailsRepo;


    @GetMapping("/list")
    public List<giohangchitiet> listDetailCart() {
        return cartDeatailsRepo.listCartDetails();
    }
}
