package com.mekongtravel.service;
import com.mekongtravel.repository.TinhThanhRepository;
import org.springframework.stereotype.Service;
import com.mekongtravel.model.TinhThanh;
public class TinhThanhService {
    private final TinhThanhRepository tinhThanhRepository;

    public TinhThanhService(TinhThanhRepository tinhThanhRepository) {
        this.tinhThanhRepository = tinhThanhRepository;
    }

    public TinhThanh getByMaTinh(String maTinh) {
        return tinhThanhRepository.findByMaTinh(maTinh);
    }
}
