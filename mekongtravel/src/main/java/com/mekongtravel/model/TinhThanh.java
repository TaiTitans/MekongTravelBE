package com.mekongtravel.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import java.util.List;
@Document(collection = "tinhthanhs")
public class TinhThanh {
    @Id
    private String _id;
    @Field("maTinh")
    private String maTinh;
    @Field("amThuc")
    private List<MonAn> amThuc;
    @Field("diaDiem")
    private List<DiaDiem> diaDiem;

}
