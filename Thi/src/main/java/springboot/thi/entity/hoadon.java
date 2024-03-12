package springboot.thi.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity(name = "hoadon")
public class hoadon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idhd;
    private Date ngaytao;
    @ManyToOne
    @JoinColumn(name = "id_hoadonkh")
    private khachhang khachhang;
    @ManyToOne
    @JoinColumn(name = "id_hd")
    private giohang giohang;
    private BigDecimal tongtien;
}
