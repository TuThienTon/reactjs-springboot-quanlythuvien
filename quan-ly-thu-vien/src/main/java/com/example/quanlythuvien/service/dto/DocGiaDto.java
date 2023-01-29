package com.example.quanlythuvien.service.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link com.example.quanlythuvien.domain.DocGia} entity
 */
@Data
public class DocGiaDto implements Serializable {
    private final Integer id;
    private final String tenDocGia;
    private final String diaChi;
    private final TheThuVienDto soThe;
}