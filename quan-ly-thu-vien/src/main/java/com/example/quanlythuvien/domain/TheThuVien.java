package com.example.quanlythuvien.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "the_thu_vien")
public class TheThuVien {
    @Id
    @Column(name = "so_the", nullable = false)
    private Integer id;

    @Column(name = "ngay_bat_dau")
    private LocalDate ngayBatDau;

    @Column(name = "ngay_het_han")
    private LocalDate ngayHetHan;

    @Column(name = "ghi_chu", length = 1000)
    private String ghiChu;


}