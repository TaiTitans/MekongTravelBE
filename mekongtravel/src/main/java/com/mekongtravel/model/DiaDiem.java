package com.mekongtravel.model;
import org.springframework.data.mongodb.core.mapping.Field;

public class DiaDiem {
    @Field("tenDiaDiem")
    private String tenDiaDiem;

    @Field("moTa")
    private String moTa;

    @Field("soSao")
    private int soSao;

    @Field("hinhAnh")
    private String hinhAnh;
}
