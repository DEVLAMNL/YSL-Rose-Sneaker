package springboot.thi.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import springboot.thi.entity.hoadon;

import java.util.List;

public interface InchoiceRepo extends JpaRepository<hoadon, Integer> {
    @Query(value = " select * from  hoadon where trangthai =  0 ",nativeQuery = true)
    public List<hoadon> listhoahon(int trangthai);
    @Query(value = "select * from hoadon where maHD = ?",nativeQuery = true)
    public List<hoadon> getAllByMa (String Ma);
}
