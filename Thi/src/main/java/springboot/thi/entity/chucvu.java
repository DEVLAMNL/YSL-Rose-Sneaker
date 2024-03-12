package springboot.thi.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity(name = "Chucvu")
public class chucvu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_chucvu;

    @Column(name = "ten")
    private String ten_chucvu;


}
