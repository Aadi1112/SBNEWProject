package com.aadi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.aadi.entity.Book;
import com.aadi.repo.Bookrepository;

@SpringBootApplication
public class SpringDataJpa1Application implements CommandLineRunner {

	public static void main(String[] args) {
		ConfigurableApplicationContext cc = SpringApplication.run(SpringDataJpa1Application.class, args);

//	     Bookrepository bookrepository= cc.getBean(Bookrepository.class);
//	
//	     System.out.println(bookrepository.getClass().getName());
	}

	@Autowired
	Bookrepository bookrepository;

	// implmemented class ka object banega
	// proxy implemented classes created by spring boot internally..

	@Override
	public void run(String... args) throws Exception {
		
		
	//	List<Book> books= bookrepository.findByBookPriceGreaterThan(5000.00);

		//List<Book> books= bookrepository.findByBookName("NodeJS");
		
//		List<Book> books= bookrepository.findByBookPrice(3000.00);
//		books.forEach(System.out::println);
		
		//List<Book> books= bookrepository.getBooks();
		//books.forEach(System.out::println);
		//
//		Book book1=new Book(101, "NodeJS", 8000.00);
//		Book book2=new Book(102, "Javascript", 3000.00);
//		Book book3=new Book(103, "React", 7000.00);
//		
//		ArrayList<Book> books=new ArrayList<Book>();
//		books.add(book1);
//		books.add(book2);
//		books.add(book3);

		// bookrepository.save(book1);
		// bookrepository.saveAll(Arrays.asList(book1,book2,book3));

		// boolean b = bookrepository.existsById(100);

		// System.out.println(b);

//		if (bookrepository.existsById(105)) {
//			Optional<Book> book = bookrepository.findById(105);
//			System.out.println(book.get());
//
//		} else {
//			System.out.println("Not found");
//		}
		
//		 long l=bookrepository.count();
//		 System.out.println(l);
		
//		Iterable<Book> books= bookrepository.findAllById(Arrays.asList(102,104,105));
//		 
//		books.forEach(System.out::println);
		
//		Iterable<Book> books= bookrepository.findAll();
//		books.forEach(System.out::println);
		
//		bookrepository.deleteById(140);
		
//		bookrepository.deleteAllById(Arrays.asList(102,104));
		
		//bookrepository.deleteAll();
		
		//I want get thoese book which price > 5000
		
		//How we can create custom method ...
	}

}
