package springboot.thi.dto;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class khachhangdto {
    private int idkh;
    private String tenkh;
    private String email;
    private String sdt;
}
