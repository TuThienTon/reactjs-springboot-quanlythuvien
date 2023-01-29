package com.example.quanlythuvien.service.mapper;

import com.example.quanlythuvien.domain.TheThuVien;
import com.example.quanlythuvien.service.dto.TheThuVienDto;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TheThuVienMapper implements EntityMapper<TheThuVienDto, TheThuVien> {
    @Override
    public TheThuVienDto toDo(TheThuVien theThuVien) {
        return null;
    }

    @Override
    public TheThuVien toEntity(TheThuVienDto theThuVienDto) {
        return null;
    }

    @Override
    public List<TheThuVienDto> toDo(List<TheThuVien> e) {
        return null;
    }

    @Override
    public List<TheThuVien> toEntity(List<TheThuVienDto> d) {
        return null;
    }
}
