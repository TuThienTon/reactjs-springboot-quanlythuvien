package com.example.quanlythuvien.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "nha_xuat_ban")
public class NhaXuatBan {
    @Id
    @Column(name = "ma_nxb", nullable = false)
    private Integer id;

    @Column(name = "ten_nxb", length = 50)
    private String tenNxb;

    @Column(name = "dia_chi", length = 100)
    private String diaChi;

    @Column(name = "email", length = 45)
    private String email;

    @Column(name = "thong_tin_nguoi_dai_dien", length = 100)
    private String thongTinNguoiDaiDien;


}