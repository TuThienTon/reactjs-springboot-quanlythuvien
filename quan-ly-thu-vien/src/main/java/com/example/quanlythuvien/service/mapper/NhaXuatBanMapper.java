package com.example.quanlythuvien.service.mapper;

import com.example.quanlythuvien.domain.NhaXuatBan;
import com.example.quanlythuvien.service.dto.NhanVienDto;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class NhaXuatBanMapper implements EntityMapper<NhanVienDto, NhaXuatBan> {
    @Override
    public NhanVienDto toDo(NhaXuatBan nhaXuatBan) {
        return null;
    }

    @Override
    public NhaXuatBan toEntity(NhanVienDto nhanVienDto) {
        return null;
    }

    @Override
    public List<NhanVienDto> toDo(List<NhaXuatBan> e) {
        return null;
    }

    @Override
    public List<NhaXuatBan> toEntity(List<NhanVienDto> d) {
        return null;
    }
}
