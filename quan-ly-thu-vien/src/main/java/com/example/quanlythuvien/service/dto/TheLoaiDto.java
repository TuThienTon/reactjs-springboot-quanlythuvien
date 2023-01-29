package com.example.quanlythuvien.service.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link com.example.quanlythuvien.domain.TheLoai} entity
 */
@Data
public class TheLoaiDto implements Serializable {
    private final Integer id;
    private final String tenTheLoai;
}