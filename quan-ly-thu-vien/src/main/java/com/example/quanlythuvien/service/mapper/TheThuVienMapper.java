package com.example.quanlythuvien.service.mapper;

import com.example.quanlythuvien.domain.TheThuVien;
import com.example.quanlythuvien.service.dto.TheThuVienDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TheThuVienMapper implements EntityMapper<TheThuVienDto, TheThuVien> {
    @Override
    public TheThuVienDto toDo(TheThuVien entity) {
        TheThuVienDto dto = new TheThuVienDto();
        dto.setId(entity.getId());
        dto.setNgayBatDau(entity.getNgayBatDau());
        dto.setNgayHetHan(entity.getNgayHetHan());
        dto.setGhiChu(entity.getGhiChu());
        return dto;
    }

    @Override
    public TheThuVien toEntity(TheThuVienDto dto) {
        TheThuVien entity = new TheThuVien();
        entity.setId(dto.getId());
        entity.setNgayBatDau(dto.getNgayBatDau());
        entity.setNgayHetHan(dto.getNgayHetHan());
        entity.setGhiChu(dto.getGhiChu());
        return entity;
    }

    @Override
    public List<TheThuVienDto> toDo(List<TheThuVien> e) {
        List<TheThuVienDto> dtos = new ArrayList<>();
        e.forEach(theThuVien -> {
            TheThuVienDto dto = toDo(theThuVien);
            dtos.add(dto);
        });
        return dtos;
    }

    @Override
    public List<TheThuVien> toEntity(List<TheThuVienDto> d) {
        return null;
    }
}
