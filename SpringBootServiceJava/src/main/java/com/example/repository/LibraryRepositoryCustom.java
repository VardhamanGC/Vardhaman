package com.example.repository;

import com.example.controller.Library;

import java.util.List;

public interface LibraryRepositoryCustom {

    public List<Library> findByAuthor(String author);

    public void newBook(String id, Library library);
}
