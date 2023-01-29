package com.example.quanlythuvien.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "ct_muon_tra")
public class CtMuonTra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ma_ct_muon_tra", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ma_muon_tra")
    private MuonTra maMuonTra;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ma_sach")
    private Sach maSach;

    @Column(name = "ghi_chu", length = 45)
    private String ghiChu;

    @Column(name = "da_tra")
    private Boolean daTra;

    @Column(name = "ngay_tra")
    private LocalDate ngayTra;

}