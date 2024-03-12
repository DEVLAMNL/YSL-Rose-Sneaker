package springboot.thi.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity(name = "product")
public class product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column(name = "ten")
    String ten;
    @Column(name = "soluong")
    int soluong;
    @Column(name = "giaban")
    int giaban;
    @Column(name = "trangthai")
    int trangthai;

    @ManyToOne
    @JoinColumn(name = "id_sanpham")
    private giohang giohang;
}
