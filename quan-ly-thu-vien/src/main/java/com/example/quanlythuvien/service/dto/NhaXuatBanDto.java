package com.example.quanlythuvien.service.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class NhaXuatBanDto {
    private Integer id;
    private String tenNxb;
    private String diaChi;
    private String email;
    private String thongTinNguoiDaiDien;
}