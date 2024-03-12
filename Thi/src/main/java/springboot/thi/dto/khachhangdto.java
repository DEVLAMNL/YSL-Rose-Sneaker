package springboot.thi.dto;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class khachhangdto {
    private int idkh;
    private String username;
    private String password;
}
