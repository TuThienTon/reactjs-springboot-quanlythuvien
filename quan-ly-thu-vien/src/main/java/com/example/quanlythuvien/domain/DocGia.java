package com.example.quanlythuvien.domain;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "doc_gia")
public class DocGia {
    @Id
    @Column(name = "ma_doc_gia", nullable = false)
    private Integer id;

    @Column(name = "ten_doc_gia", length = 45)
    private String tenDocGia;

    @Column(name = "dia_chi", length = 100)
    private String diaChi;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "so_the")
    private TheThuVien soThe;


}