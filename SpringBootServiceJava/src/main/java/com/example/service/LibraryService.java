package com.example.service;

import com.example.controller.Library;
import com.example.repository.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LibraryService {
    @Autowired
    LibraryRepository repository;
    public boolean bookAlreadyPresent(String id){

       Optional<Library> record = repository.findById(id);
        if(record.isPresent())
            return true;
        else
            return false;
    }

    public String buildId(String isbn,int aisle){
        return isbn+aisle;
    }
}
