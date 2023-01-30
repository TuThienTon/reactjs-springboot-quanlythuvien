package com.example.quanlythuvien.service.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

@Data
public class SachDto {
    private Integer id;
    private String tenSach;
    private TacGiaDto maTacGia;
    private TheLoaiDto maTheLoai;
    private NhaXuatBanDto maNxb;
    private LocalDate namXuatBan;
}