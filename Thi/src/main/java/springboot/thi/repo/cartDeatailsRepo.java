package springboot.thi.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;
import springboot.thi.entity.giohangchitiet;

import java.util.List;

public interface cartDeatailsRepo extends JpaRepository<giohangchitiet, Integer> {
    @Transactional
    @Modifying
    @Query(value = "SELECT dc.idghct, pr.ten AS tenSanPham, dc.soluong, dc.gia " +
            "FROM detailcart dc " +
            "JOIN hoadon hd ON hd.idhd = dc.id_hd " + // Thêm khoảng trống sau JOIN hoadon
            "JOIN product pr ON pr.id = dc.id_sanpham", nativeQuery = true)
    List<giohangchitiet> listCartDetails();

}
