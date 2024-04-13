package com.mekongtravel.controller;
import com.mekongtravel.model.TinhThanh;
import com.mekongtravel.util.ErrorResponse;
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
    public ResponseEntity<?> getByMaTinh(@PathVariable String maTinh) {
        try {
            TinhThanh tinhThanh = tinhThanhService.getByMaTinh(maTinh);
            return ResponseEntity.ok(tinhThanh);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(new ErrorResponse(e.getMessage()));
        }
    }
    @PostMapping
    public ResponseEntity<TinhThanh> createTinhThanh(@RequestBody TinhThanh tinhThanh){
        TinhThanh savedTinhThanh = tinhThanhService.save(tinhThanh);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedTinhThanh);
    }
}