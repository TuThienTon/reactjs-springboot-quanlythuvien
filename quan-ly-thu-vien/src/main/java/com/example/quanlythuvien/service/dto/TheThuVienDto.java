package com.example.quanlythuvien.service.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

@Data
public class TheThuVienDto {
    private Integer id;
    private LocalDate ngayBatDau;
    private LocalDate ngayHetHan;
    private String ghiChu;
}