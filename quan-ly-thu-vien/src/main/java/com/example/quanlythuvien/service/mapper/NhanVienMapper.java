package com.example.quanlythuvien.service.mapper;

import com.example.quanlythuvien.domain.NhanVien;
import com.example.quanlythuvien.service.dto.NhanVienDto;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class NhanVienMapper implements EntityMapper<NhanVienDto, NhanVien> {
    @Override
    public NhanVienDto toDo(NhanVien nhanVien) {
        return null;
    }

    @Override
    public NhanVien toEntity(NhanVienDto nhanVienDto) {
        return null;
    }

    @Override
    public List<NhanVienDto> toDo(List<NhanVien> e) {
        return null;
    }

    @Override
    public List<NhanVien> toEntity(List<NhanVienDto> d) {
        return null;
    }
}
