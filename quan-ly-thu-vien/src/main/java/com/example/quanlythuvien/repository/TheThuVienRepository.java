package com.example.quanlythuvien.repository;

import com.example.quanlythuvien.domain.TheThuVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TheThuVienRepository extends JpaRepository<TheThuVien, Integer> {
}