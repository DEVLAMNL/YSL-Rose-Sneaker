package springboot.thi.service;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;
import springboot.thi.dto.khachhangdto;
import springboot.thi.entity.khachhang;
import springboot.thi.repo.khachhangRepo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class khachhangService {
    public final khachhangRepo khachhangRepo;

    @Autowired
    public khachhangService(khachhangRepo khachhangRepo) {
        this.khachhangRepo = khachhangRepo;
    }

    public List<khachhangdto> GetAll() {
        List<khachhang> listkhachhang = khachhangRepo.findAll();
        if (listkhachhang == null || listkhachhang.isEmpty()) {
            return Collections.emptyList();
        }
        return listkhachhang.stream()
                .map(kh -> new khachhangdto(kh.getIdkh(), kh.getUsername(), kh.getPassword()))
                .collect(Collectors.toList());
    }


}
