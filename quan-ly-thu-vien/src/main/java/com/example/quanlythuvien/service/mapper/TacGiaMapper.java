package com.example.quanlythuvien.service.mapper;

import com.example.quanlythuvien.domain.TacGia;
import com.example.quanlythuvien.service.dto.TacGiaDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TacGiaMapper implements EntityMapper<TacGiaDto, TacGia> {
    @Override
    public TacGiaDto toDo(TacGia entity) {
        TacGiaDto dto = new TacGiaDto();
        dto.setId(entity.getId());
        dto.setTenTacGia(entity.getTenTacGia());
        dto.setWebsite(entity.getWebsite());
        dto.setGhiChu(entity.getGhiChu());
        return dto;
    }

    @Override
    public TacGia toEntity(TacGiaDto dto) {
        TacGia entity = new TacGia();
        entity.setId(dto.getId());
        entity.setTenTacGia(dto.getTenTacGia());
        entity.setWebsite(dto.getWebsite());
        entity.setGhiChu(dto.getGhiChu());
        return entity;
    }

    @Override
    public List<TacGiaDto> toDo(List<TacGia> e) {
        List<TacGiaDto> dtos = new ArrayList<>();
        e.forEach(tacGia -> {
            TacGiaDto dto = toDo(tacGia);
            dtos.add(dto);
        });
        return dtos;
    }

    @Override
    public List<TacGia> toEntity(List<TacGiaDto> d) {
        return null;
    }
}
