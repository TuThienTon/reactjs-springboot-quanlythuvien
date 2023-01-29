package com.example.quanlythuvien.service.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * A DTO for the {@link com.example.quanlythuvien.domain.CtMuonTra} entity
 */
@Data
public class CtMuonTraDto implements Serializable {
    private final Integer id;
    private final MuonTraDto maMuonTra;
    private final SachDto maSach;
    private final String ghiChu;
    private final Boolean daTra;
    private final LocalDate ngayTra;
}