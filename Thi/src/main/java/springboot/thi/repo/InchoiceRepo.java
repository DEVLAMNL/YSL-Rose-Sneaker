package springboot.thi.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import springboot.thi.entity.hoadon;

public interface InchoiceRepo extends JpaRepository<hoadon, Integer> {
}
