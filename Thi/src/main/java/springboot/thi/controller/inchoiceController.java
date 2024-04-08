package springboot.thi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springboot.thi.entity.hoadon;
import springboot.thi.repo.InchoiceRepo;

import java.util.Date;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/inchoice")
@CrossOrigin("*")
public class inchoiceController {

    @Autowired
    private InchoiceRepo inchoiceRepo;

    @GetMapping("/Data")
    public List<hoadon> Inchoice() {
        List<hoadon> listHoaDon = inchoiceRepo.findAll();
        return listHoaDon;
    }

    @GetMapping("/getIchoicebyTrangthai")
    public List<hoadon> TakeMaHD(Integer trangthai) {
        trangthai = 0;
        List<hoadon> listHoaDon = inchoiceRepo.listhoahon(trangthai);
        return listHoaDon;
    }

    @GetMapping("/{maHD}")
    public List<hoadon> getMa(@PathVariable("maHD") String Ma) {
        List<hoadon> listIchoice = inchoiceRepo.getAllByMa(Ma);
        return listIchoice;
    }

    @PostMapping("/createInchoice")
    public ResponseEntity<hoadon> createInchoice(@RequestBody hoadon hoadon) {
        inchoiceRepo.save(hoadon);
        return ResponseEntity.ok(hoadon);
    }

}
