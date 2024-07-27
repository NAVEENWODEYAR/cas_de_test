package com.junit.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.junit.entity.Book;

/**
 * @author Naveen K Wodeyar
 * @date 16-Jun-2024
 * @apiDoc com.junit.repo
 */
public interface BookRepository extends JpaRepository<Book, Long>{

	public void findByBkName(String pBkName);
}
