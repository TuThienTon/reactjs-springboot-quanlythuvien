package com.example.quanlythuvien.service.mapper;

import com.example.quanlythuvien.domain.NhanVien;
import com.example.quanlythuvien.service.dto.NhanVienDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class NhanVienMapper implements EntityMapper<NhanVienDto, NhanVien> {
    @Override
    public NhanVienDto toDo(NhanVien entity) {
        NhanVienDto dto = new NhanVienDto();
        dto.setId(entity.getId());
        dto.setHoTen(entity.getHoTen());
        dto.setNgaySinh(entity.getNgaySinh());
        dto.setSoDienThoai(entity.getSoDienThoai());
        return dto;
    }

    @Override
    public NhanVien toEntity(NhanVienDto dto) {
        NhanVien entity = new NhanVien();
        entity.setId(dto.getId());
        entity.setHoTen(dto.getHoTen());
        entity.setNgaySinh(dto.getNgaySinh());
        entity.setSoDienThoai(dto.getSoDienThoai());
        return entity;
    }

    @Override
    public List<NhanVienDto> toDo(List<NhanVien> e) {
        List<NhanVienDto> dtos = new ArrayList<>();
        e.forEach(nhanVien -> {
            NhanVienDto dto = toDo(nhanVien);
            dtos.add(dto);
        });
        return dtos;
    }

    @Override
    public List<NhanVien> toEntity(List<NhanVienDto> d) {
        return null;
    }
}
