package repository;

import model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class BookRepository extends JpaRepository<Book,  Long> {
}
