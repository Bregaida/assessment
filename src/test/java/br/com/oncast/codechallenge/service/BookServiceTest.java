/**
 * 
 */
package br.com.oncast.codechallenge.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.oncast.codechallenge.common.Util;
import br.com.oncast.codechallenge.domain.Book;
import br.com.oncast.codechallenge.exception.OrderingException;

/**
 * @author eduardobregaida
 * 
 */
public class BookServiceTest extends AbstractServiceTestSupport {

    @Autowired
    private BookService service = new BookService();
    private List<String> attributes = null;
    private Collection<String> valores = null;

    @Before
    public void setup() {
	this.attributes = new ArrayList<>();
	this.valores = new ArrayList<>();

    }

    @Test
    public void deveriaInserirQuandoNaoExisteDados() {
	if (service.findAll().isEmpty()) {
	    for (Book book : Util.cargaInicial()) {
		service.save(book);
	    }
	    Assert.assertTrue(service.findAll().size() > 0);
	}

    }

    @Test
    public void deveriaTrazerLivrosPorTitulo() {
	// parametros para filtro
	attributes.add("title");

	valores.add("Book 3");
	valores.add("Book 4");
	valores.add("Book 1");
	valores.add("Book 2");

	Collection<Book> books = service.findAllByAttributes(attributes);
	for (Book book : books) {
	    Assert.assertTrue(valores.contains(book.getId()));
	}

    }

    @Test
    public void deveriaTrazerLivrosPorTituloComAutor() {
	// parametros para filtro
	attributes.add("title");
	attributes.add("author");
	Collection<Book> books = service.findAllByAttributes(attributes);

	// valores para testar resultado
	valores.add("Book 1");
	valores.add("Book 4");
	valores.add("Book 3");
	valores.add("Book 2");

	for (Book book : books) {
	    Assert.assertTrue(valores.contains(book.getId()));
	}
    }

    @Test
    public void deveriaTrazerLivrosPorTodasAsCondicoes() {
	// parametros para filtro
	attributes.add("title");
	attributes.add("author");
	attributes.add("editionYear");

	// valores para testar resultado
	valores.add("Book 4");
	valores.add("Book 1");
	valores.add("Book 3");
	valores.add("Book 2");

	Collection<Book> books = service.findAllByAttributes(attributes);
	for (Book book : books) {
	    Assert.assertTrue(valores.contains(book.getId()));
	}

    }

    @Test(expected = OrderingException.class)
    public void deveriaLancarUmaException() {
	attributes = null;
	service.findAllByAttributes(attributes);
    }

    @Test
    public void deveriaDevolverVazio() {
	Collection<Book> books = service.findAllByAttributes(attributes);
	Assert.assertTrue(books.isEmpty());

    }

}
