/**
 * 
 */
package br.com.oncast.codechallenge.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.oncast.codechallenge.domain.Book;

/**
 * @author eduardobregaida
 * 
 */
@Repository
public interface BookRepository extends MongoRepository<Book, String> {

}
