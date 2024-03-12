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

    @GetMapping("/inchoiceData")
    public ResponseEntity<hoadon> Inchoice() {
        List<hoadon> listHoaDon = inchoiceRepo.findAll();
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    @PostMapping("/createInchoice")
    public ResponseEntity<hoadon> createInchoice(@RequestBody hoadon hoadon) {
        Random rd = new Random();
        hoadon hd = new hoadon();
        hd.setIdhd(rd.nextInt(99));
        hd.setNgaytao(new Date());
        hd = inchoiceRepo.save(hd);
        return ResponseEntity.ok(hd);
    }
}
