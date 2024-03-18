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

    @PostMapping("/createInchoice")
    public ResponseEntity<hoadon> createInchoice(@RequestBody hoadon hoadon) {
         inchoiceRepo.save(hoadon);
        return ResponseEntity.ok(hoadon);
    }

}
