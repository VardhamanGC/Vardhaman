package com.example;

import com.example.controller.BiodataTable;
import com.example.controller.Library;
import com.example.repository.BiodataRepository;
import com.example.repository.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.List;

@SpringBootApplication
@EnableJpaRepositories
public class SpringBootServiceJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootServiceJavaApplication.class, args);
	}
	/*@Autowired
	BiodataRepository repository;
	@Autowired
	BiodataTable en;
	@Override
	public void run(String[] args){

		en.setId(1); //Create operation
		en.setName("Malleshwar");
		en.setYob(1967);
		en.setPob("Hyderabad");
		en.setAge(2024-1967);
		en.setProfession("Software Engineer");
		repository.save(en);

		en.setId(2); //Create operation
		en.setName("Kalpana Madhavi");
		en.setYob(1984);
		en.setPob("Pothireddypally");
		en.setAge(2024-1984);
		en.setProfession("Home Maker");
		repository.save(en);

		en.setId(3); //Create operation
		en.setName("Vardhaman");
		en.setYob(2002);
		en.setPob("Nagarkurnool");
		en.setAge(2024-2002);
		en.setProfession("Student");
		repository.save(en);

		en.setId(4); //Create operation
		en.setName("Deshna");
		en.setYob(2006);
		en.setPob("Nagrakurnool");
		en.setAge(2024-2006);
		en.setProfession("Student");
		repository.save(en);

		en = repository.findById(3).get(); //Read operation
		System.out.println(en.getProfession());

		repository.deleteById(1); //Delete operation
	}*/

	/*

	To override run method in runner file we need to use CommandLineRunner interface
	@Autowired
	LibraryRepository repository;
	@Autowired
	Library en;

	@Override
	public void run(String[] args){
		Library lib = repository.findById("fdsefr343").get();//Read operation
		System.out.println(lib.getAuthor());

		//Library en = new Library();
		en.setBook_name("Get Job Ready");
		en.setId("MR299");
		en.setIsbn("MR");
		en.setAisle(299);
		en.setAuthor("Vasu Eda");
		//repository.save(en);//For creating or saving or adding a new record

		List<Library> allRecords = repository.findAll();//For getting all the book names in the table
		for(Library item:allRecords){
			System.out.println(item.getBook_name());
		}

		repository.delete(en);//Operation to delete a record in a table. Entity is nothing but the class which is responsible for creating a record in a table
	}*/
}
