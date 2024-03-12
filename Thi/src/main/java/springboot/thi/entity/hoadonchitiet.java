package springboot.thi.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Entity(name = "hoadonchitiet")
public class hoadonchitiet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idhdct;
    @ManyToOne
    @JoinColumn(name = "id")
    private product product;
    @ManyToOne
    @JoinColumn(name = "idhd")
    private hoadon hoadon;
    private int soluong;
    private BigDecimal dongia;
}
