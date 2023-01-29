package com.example.quanlythuvien.service.mapper;

import com.example.quanlythuvien.domain.CtMuonTra;
import com.example.quanlythuvien.service.dto.CtMuonTraDto;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CtMuonTraMapper implements EntityMapper<CtMuonTraDto, CtMuonTra> {
    @Override
    public CtMuonTraDto toDo(CtMuonTra ctMuonTra) {
        return null;
    }

    @Override
    public CtMuonTra toEntity(CtMuonTraDto ctMuonTraDto) {
        return null;
    }

    @Override
    public List<CtMuonTraDto> toDo(List<CtMuonTra> e) {
        return null;
    }

    @Override
    public List<CtMuonTra> toEntity(List<CtMuonTraDto> d) {
        return null;
    }
}
