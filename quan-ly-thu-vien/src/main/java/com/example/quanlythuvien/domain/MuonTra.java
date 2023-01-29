package com.example.quanlythuvien.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "muon_tra")
public class MuonTra {
    @Id
    @Column(name = "ma_muon_tra", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "so_the")
    private TheThuVien soThe;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ma_nhan_vien")
    private NhanVien maNhanVien;

    @Column(name = "ngay_muon")
    private LocalDate ngayMuon;


}