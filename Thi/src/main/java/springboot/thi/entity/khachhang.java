package springboot.thi.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Data
@Entity(name = "khachhang")
public class khachhang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_khach_hang")
    private int idkh;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
    @Column(name = "hoten")
    private String hoten;
    @Column(name = "sodienthoai")
    private String sodienthoai;
    @Column(name = "diachi")
    private String diachi;
    @Column(name = "Email")
    private String email;
    @Column(name = "ngaysinh")
    private Date ngaysinh;
    @Column(name = "gioitinh")
    private int gioitinh;
    @Column(name = "ngaydangky")
    private Date ngaydangky;
    @Column(name = "loaikhachhang")
    private int loaikhachhang;
    @Column(name = "trangthai")
    private int trangthai;
    private int id_hoadonkh;
    @ManyToOne
    @JoinColumn(name = "chucvu_id")
    private chucvu chucvu;

    @ManyToOne
    @JoinColumn(name = "id_khachhang")
    private giohang giohang;
}
