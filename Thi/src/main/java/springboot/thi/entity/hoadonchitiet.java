package springboot.thi.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Entity(name = "hoadonchitiet")
public class hoadonchitiet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int idhdct;

    @ManyToOne
    @JoinColumn(name = "id_product")
    private product product;

    @ManyToOne
    @JoinColumn(name = "id_bill")
    private hoadon hoadon;

    private int soluong;

    private BigDecimal dongia;
}
