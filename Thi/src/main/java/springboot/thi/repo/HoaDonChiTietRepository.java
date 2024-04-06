package springboot.thi.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import springboot.thi.entity.hoadonchitiet;

import java.util.List;

public interface HoaDonChiTietRepository extends JpaRepository<hoadonchitiet, Integer> {

    @Query(value = """
        select * from hoadonchitiet where id_bill = :idBill and id_product = :idProduct
    """, nativeQuery = true)
    List<hoadonchitiet> findBillDetailsByIdBillAndIdProduct(@Param("idBill")Integer idBill,
                                                            @Param("idProduct")Integer idProduct);
}
