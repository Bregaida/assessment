/**
 * 
 */
package br.com.oncast.codechallenge.repository;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.oncast.codechallenge.common.Util;
import br.com.oncast.codechallenge.domain.Book;

/**
 * @author eduardobregaida
 * 
 */
public class BookRepositoryTest extends AbstractRepositoryTestSupport {

    @Autowired
    private BookRepository repository;

    @Test
    public void deveriaInserirQuandoNaoExisteDados() {
	if (repository.findAll().isEmpty()) {
	    for (Book book : Util.cargaInicial()) {
		repository.save(book);
	    }
	    Assert.assertTrue(repository.findAll().size() > 0);
	}

    }

}
