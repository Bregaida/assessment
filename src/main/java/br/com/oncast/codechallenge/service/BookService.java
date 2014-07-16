package br.com.oncast.codechallenge.service;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.com.oncast.codechallenge.common.AbstractService;
import br.com.oncast.codechallenge.common.Util;
import br.com.oncast.codechallenge.domain.Book;
import br.com.oncast.codechallenge.exception.OrderingException;
import br.com.oncast.codechallenge.repository.BookRepository;

/**
 * @author eduardobregaida
 * 
 */

@Service
public class BookService extends AbstractService<Book, String> {

    @Autowired
    public void setRepository(BookRepository bookRepository) {
	super.setRepository(bookRepository);
    }

    public void loadData() {
	for (Book book : Util.cargaInicial()) {
	    this.save(book);
	}
    }

    public Collection<Book> findAllByAttributes(Collection<String> attributes) {
	if (attributes != null) {
	    if (attributes.isEmpty()) {
		return new ArrayList<>();
	    }
	    if (attributes.size() >= 1) {
		if (attributes.size() == 1 && attributes.contains("title")) {
		    final Sort sort = new Sort(Sort.Direction.ASC,
			    getSortAttribute());
		    return ((BookRepository) getRepository()).findAll(sort);
		} else if (attributes.size() == 2
			&& attributes.contains("title")
			&& attributes.contains("author")) {
		    final Sort sort = new Sort(Sort.Direction.ASC, "author")
			    .and(new Sort(Sort.Direction.DESC,
				    getSortAttribute()));
		    return getRepository().findAll(sort);
		} else if (attributes.size() > 2
			&& attributes.contains("title")
			&& attributes.contains("author")
			&& attributes.contains("editionYear")) {
		    final Sort sort = new Sort(Sort.Direction.DESC,
			    "editionYear").and(
			    new Sort(Sort.Direction.DESC, "author")).and(
			    new Sort(Sort.Direction.ASC, getSortAttribute()));
		    return getRepository().findAll(sort);
		}
	    }

	} else
	    throw new OrderingException("Select one item!");
	return null;
    }

    @Override
    public String getSortAttribute() {
	return "title";
    }
}
