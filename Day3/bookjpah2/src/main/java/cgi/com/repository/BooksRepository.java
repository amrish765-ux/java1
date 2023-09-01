package cgi.com.repository;

import org.springframework.data.repository.CrudRepository;  
import cgi.com.model.Books;  
//repository that extends CrudRepository  
public interface BooksRepository extends CrudRepository<Books, Integer>  
{  
}  
