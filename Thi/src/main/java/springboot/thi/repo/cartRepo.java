package springboot.thi.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import springboot.thi.entity.giohang;
import springboot.thi.entity.giohangchitiet;

import java.util.List;

public interface cartRepo extends JpaRepository<giohang, Integer> {



}
