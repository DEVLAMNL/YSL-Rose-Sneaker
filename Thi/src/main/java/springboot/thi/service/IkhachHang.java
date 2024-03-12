package springboot.thi.service;

import springboot.thi.dto.khachhangdto;
import springboot.thi.entity.khachhang;

import java.util.List;

public interface IkhachHang {

    List<khachhangdto> GetAll();
}
