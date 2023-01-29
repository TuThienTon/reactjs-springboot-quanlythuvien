package com.example.quanlythuvien.repository;

import com.example.quanlythuvien.domain.DocGia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocGiaRepository extends JpaRepository<DocGia, Integer> {
}