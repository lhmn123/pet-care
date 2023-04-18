package com.stc.petlove.repository;

import com.stc.petlove.entities.DichVu;
import com.stc.petlove.entities.TaiKhoan;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DichVuRepository extends MongoRepository<DichVu, String> {
}
