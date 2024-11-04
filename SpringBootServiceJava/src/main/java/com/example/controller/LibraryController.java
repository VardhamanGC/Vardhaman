package com.example.controller;

import com.example.repository.LibraryRepository;
import com.example.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;


@RestController
@RequestMapping("/demo")
public class LibraryController {

    @Autowired
    LibraryRepository repository;
    @Autowired
    AddBookResponse ad;
    @Autowired
    LibraryService libraryService;

    @PostMapping("/addBook")
    public ResponseEntity addBookImplementation(@RequestBody Library library){
        String id = libraryService.buildId(library.getIsbn(),library.getAisle());
        if(!libraryService.bookAlreadyPresent(id)){
            library.setId(id);
            repository.save(library);
            ad.setMsg("Success the book is added");
            ad.setId(id);
            HttpHeaders headers = new HttpHeaders();
            headers.add("Unique", id);
            //return ad;
            return new ResponseEntity<AddBookResponse>(ad, headers, HttpStatus.CREATED);
        }
        else{
            ad.setMsg("Book already present");
            ad.setId(id);
            return new ResponseEntity<AddBookResponse>(ad, HttpStatus.ACCEPTED);
        }
    }

    @GetMapping("/getBooks/{id}")
    public Library getBookByIdImplementation(@PathVariable String id){

        try {
            Library lib = repository.findById(id).get();
            return lib;
        } catch (Exception e) {
            //throw new ResponseEntity(HttpStatus.NOT_FOUND);
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/getBooks/author")
    public List<Library> getBookByAuthor(@RequestParam String author){

        List<Library> matchedAuthorBooks = repository.findByAuthor(author);
        return matchedAuthorBooks;
    }

    @PutMapping("/updateBook/{id}")
    public Library updateBookById(@PathVariable String id,@RequestBody Library library){

        /*Library existingBook = repository.findById(id).get();
        existingBook.setAisle(library.getAisle());
        existingBook.setAuthor(library.getAuthor());
        existingBook.setBook_name(library.getBook_name());
        repository.save(existingBook);
        return existingBook;*/
        repository.newBook(id,library);
        return repository.findById(id).get();
    }
}
