package com.example.quanlythuvien.service.mapper;

import com.example.quanlythuvien.domain.DocGia;
import com.example.quanlythuvien.service.dto.DocGiaDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DocGiaMapper implements EntityMapper<DocGiaDto, DocGia> {
    @Autowired
    TheThuVienMapper theThuVienMapper;
    @Override
    public DocGiaDto toDo(DocGia entity) {
        DocGiaDto dto = new DocGiaDto();
        dto.setId(entity.getId());
        dto.setTenDocGia(entity.getTenDocGia());
        dto.setDiaChi(entity.getDiaChi());
        dto.setSoThe(theThuVienMapper.toDo(entity.getSoThe()));
        return dto;
    }

    @Override
    public DocGia toEntity(DocGiaDto dto) {
        DocGia entity = new DocGia();
        entity.setId(dto.getId());
        entity.setTenDocGia(dto.getTenDocGia());
        entity.setDiaChi(dto.getDiaChi());
        entity.setSoThe(theThuVienMapper.toEntity(dto.getSoThe()));
        return null;
    }

    @Override
    public List<DocGiaDto> toDo(List<DocGia> e) {
        List<DocGiaDto> dtos = new ArrayList<>();
        e.forEach(docGia -> {
            DocGiaDto dto = toDo(docGia);
            dtos.add(dto);
        });
        return dtos;
    }

    @Override
    public List<DocGia> toEntity(List<DocGiaDto> d) {
        return null;
    }
}
