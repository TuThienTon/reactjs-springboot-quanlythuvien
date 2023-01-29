package com.example.quanlythuvien.service.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * A DTO for the {@link com.example.quanlythuvien.domain.MuonTra} entity
 */
@Data
public class MuonTraDto implements Serializable {
    private final Integer id;
    private final TheThuVienDto soThe;
    private final NhanVienDto maNhanVien;
    private final LocalDate ngayMuon;
}