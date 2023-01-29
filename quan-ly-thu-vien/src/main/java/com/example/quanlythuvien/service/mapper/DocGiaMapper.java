package com.example.quanlythuvien.service.mapper;

import com.example.quanlythuvien.domain.DocGia;
import com.example.quanlythuvien.service.dto.DocGiaDto;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DocGiaMapper implements EntityMapper<DocGiaDto, DocGia> {
    @Override
    public DocGiaDto toDo(DocGia docGia) {
        return null;
    }

    @Override
    public DocGia toEntity(DocGiaDto docGiaDto) {
        return null;
    }

    @Override
    public List<DocGiaDto> toDo(List<DocGia> e) {
        return null;
    }

    @Override
    public List<DocGia> toEntity(List<DocGiaDto> d) {
        return null;
    }
}
