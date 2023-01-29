package com.example.quanlythuvien.service.mapper;

import com.example.quanlythuvien.domain.Sach;
import com.example.quanlythuvien.service.dto.SachDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SachMapper implements EntityMapper<SachDto, Sach> {
    @Autowired
    TacGiaMapper tacGiaMapper;
    @Autowired
    TheLoaiMapper theLoaiMapper;
    @Autowired
    NhaXuatBanMapper nhaXuatBanMapper;
    @Override
    public SachDto toDo(Sach entity) {
        SachDto dto = new SachDto();
        dto.setId(entity.getId());
        dto.setTenSach(entity.getTenSach());
        dto.setMaTacGia(tacGiaMapper.toDo(entity.getMaTacGia()));
        dto.setMaTheLoai(theLoaiMapper.toDo(entity.getMaTheLoai()));
        dto.setMaNxb(nhaXuatBanMapper.toDo(entity.getMaNxb()));
        dto.setNamXuatBan(entity.getNamXuatBan());
        return dto;
    }

    @Override
    public Sach toEntity(SachDto dto) {
        Sach entity = new Sach();
        entity.setId(dto.getId());
        entity.setTenSach(dto.getTenSach());
        entity.setMaTacGia(tacGiaMapper.toEntity(dto.getMaTacGia()));
        entity.setMaTheLoai(theLoaiMapper.toEntity(dto.getMaTheLoai()));
        entity.setMaNxb(nhaXuatBanMapper.toEntity(dto.getMaNxb()));
        entity.setNamXuatBan(dto.getNamXuatBan());
        return entity;
    }

    @Override
    public List<SachDto> toDo(List<Sach> e) {
        List<SachDto> dtos = new ArrayList<>();
        e.forEach(sach -> {
            SachDto dto = toDo(sach);
            dtos.add(dto);
        });
        return dtos;
    }

    @Override
    public List<Sach> toEntity(List<SachDto> d) {
        return null;
    }
}
