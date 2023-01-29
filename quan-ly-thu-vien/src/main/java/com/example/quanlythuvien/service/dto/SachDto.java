package com.example.quanlythuvien.service.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link com.example.quanlythuvien.domain.Sach} entity
 */
@Data
public class SachDto implements Serializable {
    private final Integer id;
    private final String tenSach;
    private final TacGiaDto maTacGia;
    private final TheLoaiDto maTheLoai;
    private final NhaXuatBanDto maNxb;
    private final String namXuatBan;
}