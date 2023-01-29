package com.example.quanlythuvien.service.mapper;

import com.example.quanlythuvien.domain.MuonTra;
import com.example.quanlythuvien.service.dto.MuonTraDto;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MuonTraMapper implements EntityMapper<MuonTraDto, MuonTra> {
    @Override
    public MuonTraDto toDo(MuonTra muonTra) {
        return null;
    }

    @Override
    public MuonTra toEntity(MuonTraDto muonTraDto) {
        return null;
    }

    @Override
    public List<MuonTraDto> toDo(List<MuonTra> e) {
        return null;
    }

    @Override
    public List<MuonTra> toEntity(List<MuonTraDto> d) {
        return null;
    }
}
