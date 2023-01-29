package com.example.quanlythuvien.service.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link com.example.quanlythuvien.domain.TacGia} entity
 */
@Data
public class TacGiaDto implements Serializable {
    private final Integer id;
    private final String tenTacGia;
    private final String website;
    private final String ghiChu;
}