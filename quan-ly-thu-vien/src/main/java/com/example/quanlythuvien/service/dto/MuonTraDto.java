package com.example.quanlythuvien.service.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

@Data
public class MuonTraDto {
    private Integer id;
    private TheThuVienDto soThe;
    private NhanVienDto maNhanVien;
    private LocalDate ngayMuon;
}