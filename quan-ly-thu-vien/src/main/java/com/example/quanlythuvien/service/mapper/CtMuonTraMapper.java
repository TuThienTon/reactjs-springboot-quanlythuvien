package com.example.quanlythuvien.service.mapper;

import com.example.quanlythuvien.domain.CtMuonTra;
import com.example.quanlythuvien.service.dto.CtMuonTraDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CtMuonTraMapper implements EntityMapper<CtMuonTraDto, CtMuonTra> {
    @Autowired
    MuonTraMapper muonTraMapper;
    @Autowired
    SachMapper sachMapper;
    @Override
    public CtMuonTraDto toDo(CtMuonTra entity) {
        CtMuonTraDto dto = new CtMuonTraDto();
        dto.setId(entity.getId());
        dto.setMaMuonTra(muonTraMapper.toDo(entity.getMaMuonTra()));
        dto.setMaSach(sachMapper.toDo(entity.getMaSach()));
        dto.setGhiChu(entity.getGhiChu());
        dto.setDaTra(entity.getDaTra());
        dto.setNgayTra(entity.getNgayTra());
        return dto;
    }

    @Override
    public CtMuonTra toEntity(CtMuonTraDto dto) {
        CtMuonTra entity = new CtMuonTra();
        entity.setId(dto.getId());
        entity.setMaMuonTra(muonTraMapper.toEntity(dto.getMaMuonTra()));
        entity.setMaSach(sachMapper.toEntity(dto.getMaSach()));
        entity.setGhiChu(dto.getGhiChu());
        entity.setDaTra(dto.getDaTra());
        entity.setNgayTra(dto.getNgayTra());
        return entity;
    }

    @Override
    public List<CtMuonTraDto> toDo(List<CtMuonTra> e) {
        List<CtMuonTraDto> dtos = new ArrayList<>();
        e.forEach(ctMuonTra -> {
            CtMuonTraDto dto = toDo(ctMuonTra);
            dtos.add(dto);
        });
        return dtos;
    }

    @Override
    public List<CtMuonTra> toEntity(List<CtMuonTraDto> d) {
        return null;
    }
}
