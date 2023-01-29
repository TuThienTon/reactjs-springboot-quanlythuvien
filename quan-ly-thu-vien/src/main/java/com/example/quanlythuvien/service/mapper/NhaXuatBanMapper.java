package com.example.quanlythuvien.service.mapper;

import com.example.quanlythuvien.domain.NhaXuatBan;
import com.example.quanlythuvien.service.dto.NhaXuatBanDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class NhaXuatBanMapper implements EntityMapper<NhaXuatBanDto, NhaXuatBan> {

    @Override
    public NhaXuatBanDto toDo(NhaXuatBan entity) {
        NhaXuatBanDto dto = new NhaXuatBanDto();
        dto.setId(entity.getId());
        dto.setTenNxb(entity.getTenNxb());
        dto.setDiaChi(entity.getDiaChi());
        dto.setEmail(entity.getEmail());
        dto.setThongTinNguoiDaiDien(entity.getThongTinNguoiDaiDien());
        return dto;
    }

    @Override
    public NhaXuatBan toEntity(NhaXuatBanDto dto) {
        NhaXuatBan entity = new NhaXuatBan();
        entity.setId(dto.getId());
        entity.setTenNxb(dto.getTenNxb());
        entity.setDiaChi(dto.getDiaChi());
        entity.setEmail(dto.getEmail());
        entity.setThongTinNguoiDaiDien(dto.getThongTinNguoiDaiDien());
        return entity;
    }

    @Override
    public List<NhaXuatBanDto> toDo(List<NhaXuatBan> e) {
        List<NhaXuatBanDto> dtos = new ArrayList<>();
        e.forEach(nhaXuatBan -> {
            NhaXuatBanDto dto = toDo(nhaXuatBan);
            dtos.add(dto);
        });
        return dtos;
    }

    @Override
    public List<NhaXuatBan> toEntity(List<NhaXuatBanDto> d) {
        return null;
    }
}
