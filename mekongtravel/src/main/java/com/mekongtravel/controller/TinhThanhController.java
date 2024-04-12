package com.mekongtravel.controller;
import com.mekongtravel.model.TinhThanh;
import org.springframework.web.bind.annotation.*;
import com.mekongtravel.service.TinhThanhService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
@RestController
@RequestMapping("/api/tinhthanh")
public class TinhThanhController {
    private final TinhThanhService tinhThanhService;

    public TinhThanhController(TinhThanhService tinhThanhService) {
        this.tinhThanhService = tinhThanhService;
    }
    @GetMapping("/{maTinh}")
    public ResponseEntity<TinhThanh> getByMaTinh(@PathVariable String maTinh){
        TinhThanh tinhThanh = tinhThanhService.getByMaTinh(maTinh);
        return ResponseEntity.ok(tinhThanh);
    }
    @PostMapping
    public ResponseEntity<TinhThanh> createTinhThanh(@RequestBody TinhThanh tinhThanh){
        TinhThanh savedTinhThanh = tinhThanhService.save(tinhThanh);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedTinhThanh);
    }
}
