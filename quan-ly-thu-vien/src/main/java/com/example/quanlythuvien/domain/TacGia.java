package com.example.quanlythuvien.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "tac_gia")
public class TacGia {
    @Id
    @Column(name = "ma_tac_gia", nullable = false)
    private Integer id;

    @Column(name = "ten_tac_gia", length = 45)
    private String tenTacGia;

    @Column(name = "website", length = 100)
    private String website;

    @Column(name = "ghi_chu", length = 1000)
    private String ghiChu;


}