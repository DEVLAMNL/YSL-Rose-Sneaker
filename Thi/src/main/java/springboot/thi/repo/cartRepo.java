package springboot.thi.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import springboot.thi.entity.giohang;

public interface cartRepo extends JpaRepository<giohang, Integer> {
//    @Query(value = "insert into ShoppingCart(idgh,id_sp) VALUES(?1 , ?2 , ?3)")
//    void insertCart(int idgh, int id_sp);
}
