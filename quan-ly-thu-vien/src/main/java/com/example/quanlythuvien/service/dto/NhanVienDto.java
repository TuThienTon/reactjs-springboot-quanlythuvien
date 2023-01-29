package com.example.quanlythuvien.service.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * A DTO for the {@link com.example.quanlythuvien.domain.NhanVien} entity
 */
@Data
public class NhanVienDto implements Serializable {
    private final Integer id;
    private final String hoTen;
    private final LocalDate ngaySinh;
    private final Integer soDienThoai;
}