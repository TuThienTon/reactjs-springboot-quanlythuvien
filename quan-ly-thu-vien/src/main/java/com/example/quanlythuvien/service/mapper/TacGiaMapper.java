package com.example.quanlythuvien.service.mapper;

import com.example.quanlythuvien.domain.TacGia;
import com.example.quanlythuvien.service.dto.TacGiaDto;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TacGiaMapper implements EntityMapper<TacGiaDto, TacGia> {
    @Override
    public TacGiaDto toDo(TacGia tacGia) {
        return null;
    }

    @Override
    public TacGia toEntity(TacGiaDto tacGiaDto) {
        return null;
    }

    @Override
    public List<TacGiaDto> toDo(List<TacGia> e) {
        return null;
    }

    @Override
    public List<TacGia> toEntity(List<TacGiaDto> d) {
        return null;
    }
}
