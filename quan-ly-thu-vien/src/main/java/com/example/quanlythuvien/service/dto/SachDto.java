package com.example.quanlythuvien.service.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class SachDto {
    private Integer id;
    private String tenSach;
    private TacGiaDto maTacGia;
    private TheLoaiDto maTheLoai;
    private NhaXuatBanDto maNxb;
    private String namXuatBan;
}