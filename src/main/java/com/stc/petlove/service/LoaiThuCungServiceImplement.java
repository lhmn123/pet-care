package com.stc.petlove.service;

import com.stc.petlove.entities.LoaiThuCung;
import com.stc.petlove.repository.LoaiThuCungRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class LoaiThuCungServiceImplement implements LoaiThuCungService {

    @Autowired
    private LoaiThuCungRepository loaiThuCungRepository;

    @Override
    public LoaiThuCung addLoaiThuCung(LoaiThuCung loaiThuCung) {
        if(loaiThuCung!=null){
            return loaiThuCungRepository.save(loaiThuCung);
        }
        return null;
    }

    @Override
    public LoaiThuCung updateLoaiThuCung(String id, LoaiThuCung loaiThuCung) {
        if(loaiThuCung!=null){
            LoaiThuCung loaiThuCung1=loaiThuCungRepository.findById(id).get();
            if(loaiThuCung1!=null){
                loaiThuCung1.setMaLoaiThuCung(loaiThuCung.getMaLoaiThuCung());
                loaiThuCung1.setTenLoaiThuCung(loaiThuCung.getTenLoaiThuCung());
                loaiThuCung1.setTrangThai(loaiThuCung.isTrangThai());

                return loaiThuCungRepository.save(loaiThuCung1);
            }
        }
        return null;
    }

    @Override
    public boolean deteleLoaiThuCung(String id) {
        LoaiThuCung loaiThuCung=loaiThuCungRepository.findById(id).get();
        if(loaiThuCung!=null){
            loaiThuCungRepository.delete(loaiThuCung);
            return true;
        }
        return false;
    }

    @Override
    public List<LoaiThuCung> getAllLoaiThuCung() {
        return loaiThuCungRepository.findAll();
    }

    @Override
    public LoaiThuCung getOneLoaiThuCung(String id) {
        return loaiThuCungRepository.findById(id).get();
    }

}
