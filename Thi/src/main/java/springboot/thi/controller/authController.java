package springboot.thi.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springboot.thi.dto.khachhangdto;
import springboot.thi.entity.khachhang;
import springboot.thi.repo.khachhangRepo;
import springboot.thi.service.khachhangService;

import java.util.List;

@RestController
@RequestMapping("/auth")
@CrossOrigin("*")
public class authController {

    @Autowired
    private khachhangRepo khachhangRP;

    @Autowired
    private khachhangService khachhangService;

    @PostMapping("/register")
    public khachhang Register(@RequestBody khachhang kh) {
        return khachhangRP.save(kh);
    }

    @GetMapping("/get-all")
    public List<khachhangdto> getall() {
        return khachhangService.GetAll();
    }
    @GetMapping("/DataUser")
    public List<khachhang> DataUser(){
        return khachhangRP.findAll();
    }
    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody khachhang khachhang) {


        khachhang user = khachhangRP.findByUsername(khachhang.getUsername());

        if (user == null) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Tài khoản không tồn tại");
        }

        if (!user.getPassword().equals(user.getPassword())) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Sai mật khẩu");
        }

        return ResponseEntity.ok("Đăng nhập thành công");
    }

}
