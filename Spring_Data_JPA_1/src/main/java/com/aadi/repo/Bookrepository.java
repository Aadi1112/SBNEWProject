package com.aadi.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.aadi.entity.Book;

public interface Bookrepository extends CrudRepository<Book, Integer> {

	
	 //HQL -> Hibernate Query Language..
	//Sql -> 
	
//	 @Query(value = "select * from books" ,nativeQuery = true)
//	 List<Book> getAllBooks();
	
//	@Query("from books")
//	List<Book> getBooks();
//	
//	 List<Book> findByBookPriceGreaterThan(Double price);
//	 
//	 List<Book> findByBookName(String bookName);
//	 
//	 List<Book> findByBookPrice(double bookPrice);
//	 
//	 List<Book> findByBookPriceLessThan(Double price);
//
}
