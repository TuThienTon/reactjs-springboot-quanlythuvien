package com.example.quanlythuvien.service.dto;

import lombok.Data;

import java.time.LocalDate;


@Data
public class NhanVienDto {
    private Integer id;
    private String hoTen;
    private LocalDate ngaySinh;
    private Integer soDienThoai;
}