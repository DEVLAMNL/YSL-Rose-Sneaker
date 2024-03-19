package springboot.thi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "detailcart")
public class giohangchitiet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idghct;
//    private int id_gh;
    private int id_hd;
    private int id_sanpham;
    private int soluong;
    private int gia;
}
