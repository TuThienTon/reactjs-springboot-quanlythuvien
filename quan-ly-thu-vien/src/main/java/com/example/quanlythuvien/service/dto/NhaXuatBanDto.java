package com.example.quanlythuvien.service.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link com.example.quanlythuvien.domain.NhaXuatBan} entity
 */
@Data
public class NhaXuatBanDto implements Serializable {
    private final Integer id;
    private final String tenNxb;
    private final String diaChi;
    private final String email;
    private final String thongTinNguoiDaiDien;
}