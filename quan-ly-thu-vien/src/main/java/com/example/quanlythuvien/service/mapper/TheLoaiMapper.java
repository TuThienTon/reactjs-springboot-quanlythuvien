package com.example.quanlythuvien.service.mapper;

import com.example.quanlythuvien.domain.TheLoai;
import com.example.quanlythuvien.service.dto.TheLoaiDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TheLoaiMapper implements EntityMapper<TheLoaiDto, TheLoai> {
    @Override
    public TheLoaiDto toDo(TheLoai entity) {
        TheLoaiDto dto = new TheLoaiDto();
        dto.setId(entity.getId());
        dto.setTenTheLoai(entity.getTenTheLoai());
        return dto;
    }

    @Override
    public TheLoai toEntity(TheLoaiDto dto) {
        TheLoai entity = new TheLoai();
        entity.setId(dto.getId());
        entity.setTenTheLoai(dto.getTenTheLoai());
        return entity;
    }

    @Override
    public List<TheLoaiDto> toDo(List<TheLoai> e) {
        List<TheLoaiDto> dtos = new ArrayList<>();
        e.forEach(theLoai -> {
            TheLoaiDto dto = toDo(theLoai);
            dtos.add(dto);
        });
        return dtos;
    }

    @Override
    public List<TheLoai> toEntity(List<TheLoaiDto> d) {
        return null;
    }
}
