package springboot.thi.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.PathVariable;
import springboot.thi.entity.product;

import java.util.List;

public interface productRepo extends JpaRepository<product ,Integer> {
    List<product> findAllById(int id);
    @Query("SELECT p FROM product p WHERE p.ten like %:ten%")
    List<product> searchName(@PathVariable("ten") String ten);
}
