package springboot.thi.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import springboot.thi.entity.khachhang;

import java.util.List;

public interface khachhangRepo extends JpaRepository<khachhang, Integer> {

    List<khachhang> findAll();

    public khachhang findByUsername(String username);
}
