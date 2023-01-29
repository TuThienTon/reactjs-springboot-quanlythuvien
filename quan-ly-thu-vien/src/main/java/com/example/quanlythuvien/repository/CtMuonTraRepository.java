package com.example.quanlythuvien.repository;

import com.example.quanlythuvien.domain.CtMuonTra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CtMuonTraRepository extends JpaRepository<CtMuonTra, Integer> {
}