package com.example.quanlythuvien.service.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class TacGiaDto {
    private Integer id;
    private String tenTacGia;
    private String website;
    private String ghiChu;
}