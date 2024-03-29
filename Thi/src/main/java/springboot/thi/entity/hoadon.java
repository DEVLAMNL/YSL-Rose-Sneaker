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
    private String maHD;
    private Date ngaytao;
    @ManyToOne
    @JoinColumn(name = "id_kh")
    private khachhang khachhang;
    @ManyToOne
    @JoinColumn(name = "id_hd")
    private giohangchitiet giohangchitiet;
    private BigDecimal tongtien;
    private int trangthai;
}
