package com.example.quanlythuvien.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "nhan_vien")
public class NhanVien {
    @Id
    @Column(name = "ma_nhan_vien", nullable = false)
    private Integer id;

    @Column(name = "ho_ten", length = 45)
    private String hoTen;

    @Column(name = "ngay_sinh")
    private LocalDate ngaySinh;

    @Column(name = "so_dien_thoai")
    private Integer soDienThoai;



}