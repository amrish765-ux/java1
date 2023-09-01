package dura.com.repository;

import org.springframework.data.repository.CrudRepository;  
import dura.com.model.Books;  
//repository that extends CrudRepository  
public interface BooksRepository extends CrudRepository<Books, Integer>  
{  
}  
