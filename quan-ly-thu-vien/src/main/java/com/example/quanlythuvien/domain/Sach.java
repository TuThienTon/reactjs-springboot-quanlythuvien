package com.example.quanlythuvien.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "sach")
public class Sach {
    @Id
    @Column(name = "ma_sach", nullable = false)
    private Integer id;

    @Column(name = "ten_sach", length = 45)
    private String tenSach;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ma_tac_gia")
    private TacGia maTacGia;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ma_the_loai")
    private TheLoai maTheLoai;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ma_nxb")
    private NhaXuatBan maNxb;

    @Column(name = "nam_xuat_ban")
    private LocalDate namXuatBan;

}