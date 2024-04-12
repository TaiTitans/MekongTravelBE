package com.mekongtravel.model;
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

    @Field("tenTinhThanh")
    private String tenTinhThanh;
    @Field("maTinh")
    private String maTinh;
    @Field("amThuc")
    private List<MonAn> amThuc;
    @Field("diaDiem")
    private List<DiaDiem> diaDiem;

}
