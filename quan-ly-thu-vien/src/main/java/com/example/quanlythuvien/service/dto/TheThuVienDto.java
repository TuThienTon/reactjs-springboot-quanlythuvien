package com.example.quanlythuvien.service.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * A DTO for the {@link com.example.quanlythuvien.domain.TheThuVien} entity
 */
@Data
public class TheThuVienDto implements Serializable {
    private final Integer id;
    private final LocalDate ngayBatDau;
    private final LocalDate ngayHetHan;
    private final String ghiChu;
}