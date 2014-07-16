/**
 * 
 */
package br.com.oncast.codechallenge.common;

import java.util.ArrayList;
import java.util.Collection;

import br.com.oncast.codechallenge.domain.Book;

/**
 * @author eduardobregaida
 * 
 */
public class Util {

    public static Collection<Book> cargaInicial() {

	// faz a Carga no Banco
	Book book = new Book();
	Collection<Book> books = new ArrayList<>();
	book.setId("Book 1");
	book.setTitle("Java How to Program");
	book.setAuthor("Deitel & Deitel");
	book.setEditionYear(2007);
	books.add(book);

	book = new Book();
	book.setId("Book 2");
	book.setTitle("Patterns of Enterprise Application Architecture");
	book.setAuthor("Martin Fowler");
	book.setEditionYear(2002);
	books.add(book);

	book = new Book();
	book.setId("Book 3");
	book.setTitle("Head First Design Patterns");
	book.setAuthor("Elisabeth Freeman");
	book.setEditionYear(2004);
	books.add(book);

	book = new Book();
	book.setId("Book 4");
	book.setTitle("Internet & World Wide Web: How to Program");
	book.setAuthor("Deitel & Deitel");
	book.setEditionYear(2007);
	books.add(book);
	return books;
    }

}
