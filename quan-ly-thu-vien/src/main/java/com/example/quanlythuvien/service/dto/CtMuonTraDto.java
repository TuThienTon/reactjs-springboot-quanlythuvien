package com.example.quanlythuvien.service.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * A DTO for the {@link com.example.quanlythuvien.domain.CtMuonTra} entity
 */
@Data
public class CtMuonTraDto {
    private Integer id;
    private MuonTraDto maMuonTra;
    private SachDto maSach;
    private String ghiChu;
    private Boolean daTra;
    private LocalDate ngayTra;
}