package com.example.repository;

import com.example.controller.BiodataTable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BiodataRepository extends JpaRepository<BiodataTable,Integer> {
}
