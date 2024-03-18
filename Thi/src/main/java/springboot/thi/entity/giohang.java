package springboot.thi.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name = "shopping_cart")
public class giohang {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idgh;
    private int id_sanpham;
    private int id_khachhang;

    @ManyToOne
    @JoinColumn(name = "idghct")
    private giohangchitiet giohangchitiet;
}
