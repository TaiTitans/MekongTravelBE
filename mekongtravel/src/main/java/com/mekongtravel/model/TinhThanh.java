package com.mekongtravel.model;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import java.util.List;
@Document(collection = "tinhthanhs")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TinhThanh {
    @Id
    private String id;

    @NotBlank
    private String tenTinhThanh;
    @NotBlank
    private String maTinh;
    @NotBlank
    private List<MonAn> amThuc;
    @NotBlank
    private List<DiaDiem> diaDiem;

}
