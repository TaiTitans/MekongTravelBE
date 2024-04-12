package com.mekongtravel.model;
import org.springframework.data.mongodb.core.mapping.Field;
public class MonAn {
    @Field("tenMonAn")
    private String tenMonAn;

    @Field("moTa")
    private String moTa;

    @Field("soTien")
    private double soTien;

    @Field("hinhAnh")
    private String hinhAnh;
}
