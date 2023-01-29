package com.example.quanlythuvien.service.mapper;

import com.example.quanlythuvien.domain.TheLoai;
import com.example.quanlythuvien.service.dto.TheLoaiDto;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TheLoaiMapper implements EntityMapper<TheLoaiDto, TheLoai> {
    @Override
    public TheLoaiDto toDo(TheLoai theLoai) {
        return null;
    }

    @Override
    public TheLoai toEntity(TheLoaiDto theLoaiDto) {
        return null;
    }

    @Override
    public List<TheLoaiDto> toDo(List<TheLoai> e) {
        return null;
    }

    @Override
    public List<TheLoai> toEntity(List<TheLoaiDto> d) {
        return null;
    }
}
