package com.mekongtravel.repository;
import com.mekongtravel.model.TinhThanh;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface TinhThanhRepository extends MongoRepository<TinhThanh, String> {
        TinhThanh findByMaTinh(String maTinh);
}
