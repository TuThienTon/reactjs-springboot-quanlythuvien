package com.example.quanlythuvien.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "the_loai")
public class TheLoai {
    @Id
    @Column(name = "ma_the_loai", nullable = false)
    private Integer id;

    @Column(name = "ten_the_loai", length = 50)
    private String tenTheLoai;


}