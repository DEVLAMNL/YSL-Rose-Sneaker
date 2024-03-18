package springboot.thi.service;

import org.springframework.stereotype.Service;
import springboot.thi.entity.giohangchitiet;
import springboot.thi.entity.hoadon;
import springboot.thi.entity.product;
import springboot.thi.repo.InchoiceRepo;
import springboot.thi.repo.cartDeatailsRepo;
import springboot.thi.repo.productRepo;

import java.util.List;

@Service
public class GioHangChiTietService implements IGiohangChiTiet {
    private final cartDeatailsRepo cartDeatailsRepo;
    private final productRepo productRepo;
    private final InchoiceRepo inchoiceRepo;

    public GioHangChiTietService(springboot.thi.repo.cartDeatailsRepo cartDeatailsRepo, springboot.thi.repo.productRepo productRepo, InchoiceRepo inchoiceRepo) {
        this.cartDeatailsRepo = cartDeatailsRepo;
        this.productRepo = productRepo;
        this.inchoiceRepo = inchoiceRepo;
    }

    @Override
    public List<giohangchitiet> listDetailCart() {
        List<giohangchitiet> list = cartDeatailsRepo.listCartDetails();
        return list;
    }
}
