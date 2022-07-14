package guru.springframework.spring5webapp.domain.repositories;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.spring5webapp.domain.Author;

public interface AuthorRepository  extends CrudRepository<Author, Long> {
    
}
