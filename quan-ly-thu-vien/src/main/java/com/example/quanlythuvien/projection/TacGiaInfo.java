package com.example.quanlythuvien.projection;

/**
 * A Projection for the {@link com.example.quanlythuvien.domain.TacGia} entity
 */
public interface TacGiaInfo {
    Integer getId();

    String getTenTacGia();

    String getWebsite();

    String getGhiChu();
}