package com.example.repository;

import com.example.controller.Library;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class LibraryRepositoryCustomImplementation implements LibraryRepositoryCustom {
    @Autowired
    LibraryRepository repository;

    @Override
    public List<Library> findByAuthor(String author) {
        List<Library> books = repository.findAll();
        List<Library> booksWithAuthor = new ArrayList<Library>();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getAuthor().equalsIgnoreCase(author)) {
                booksWithAuthor.add(books.get(i));
            }
        }
        return booksWithAuthor;
    }

    @Override
    public void newBook(String id, Library library){

        Library existingBook = repository.findById(id).get();
        existingBook.setAisle(library.getAisle());
        existingBook.setAuthor(library.getAuthor());
        existingBook.setBook_name(library.getBook_name());
        repository.save(existingBook);
        //return existingBook;
    }
}
