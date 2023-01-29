package com.example.quanlythuvien.service.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class DocGiaDto {
    private Integer id;
    private String tenDocGia;
    private String diaChi;
    private TheThuVienDto soThe;
}