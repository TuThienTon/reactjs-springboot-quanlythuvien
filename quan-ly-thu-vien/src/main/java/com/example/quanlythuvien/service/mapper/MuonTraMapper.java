package com.example.quanlythuvien.service.mapper;

import com.example.quanlythuvien.domain.MuonTra;
import com.example.quanlythuvien.service.dto.MuonTraDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MuonTraMapper implements EntityMapper<MuonTraDto, MuonTra> {
    @Autowired
    TheThuVienMapper theThuVienMapper;
    @Autowired
    NhanVienMapper nhanVienMapper;
    @Override
    public MuonTraDto toDo(MuonTra entity) {
        MuonTraDto dto = new MuonTraDto();
        dto.setId(entity.getId());
        dto.setSoThe(theThuVienMapper.toDo(entity.getSoThe()));
        dto.setMaNhanVien(nhanVienMapper.toDo(entity.getMaNhanVien()));
        dto.setNgayMuon(entity.getNgayMuon());
        return dto;
    }

    @Override
    public MuonTra toEntity(MuonTraDto dto) {
        MuonTra entity = new MuonTra();
        entity.setId(dto.getId());
        entity.setSoThe(theThuVienMapper.toEntity(dto.getSoThe()));
        entity.setMaNhanVien(nhanVienMapper.toEntity(dto.getMaNhanVien()));
        entity.setNgayMuon(dto.getNgayMuon());
        return entity;
    }

    @Override
    public List<MuonTraDto> toDo(List<MuonTra> e) {
        List<MuonTraDto> dtos = new ArrayList<>();
        e.forEach(muonTra -> {
            MuonTraDto dto = toDo(muonTra);
            dtos.add(dto);
        });
        return dtos;
    }

    @Override
    public List<MuonTra> toEntity(List<MuonTraDto> d) {
        return null;
    }
}
