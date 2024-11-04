package com.example.repository;

import com.example.controller.Library;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface LibraryRepository extends JpaRepository<Library,String>,LibraryRepositoryCustom{
}
