package springboot.thi.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import springboot.thi.entity.giohang;

public interface cartRepo extends JpaRepository<giohang, Integer> {
//    @Query(value = "select count(idgh)  from shopping_cart",nativeQuery = true)
//    public void TotalProductInCart();
}
