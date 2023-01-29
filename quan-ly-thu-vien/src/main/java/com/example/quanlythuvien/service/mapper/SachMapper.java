package com.example.quanlythuvien.service.mapper;

import com.example.quanlythuvien.domain.Sach;
import com.example.quanlythuvien.service.dto.SachDto;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SachMapper implements EntityMapper<SachDto, Sach> {
    @Override
    public SachDto toDo(Sach sach) {
        return null;
    }

    @Override
    public Sach toEntity(SachDto sachDto) {
        return null;
    }

    @Override
    public List<SachDto> toDo(List<Sach> e) {
        return null;
    }

    @Override
    public List<Sach> toEntity(List<SachDto> d) {
        return null;
    }
}
