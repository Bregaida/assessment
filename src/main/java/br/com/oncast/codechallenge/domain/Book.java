/**
 * 
 */
package br.com.oncast.codechallenge.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author eduardobregaida
 * 
 */

@Document
public class Book {
    @Id
    private String id;
    private String title;
    private String author;
    private long editionYear;

    public String getId() {
	return id;
    }

    public void setId(String id) {
	this.id = id;
    }

    public String getTitle() {
	return title;
    }

    public void setTitle(String title) {
	this.title = title;
    }

    public String getAuthor() {
	return author;
    }

    public void setAuthor(String author) {
	this.author = author;
    }

    public long getEditionYear() {
	return editionYear;
    }

    public void setEditionYear(long editionYear) {
	this.editionYear = editionYear;
    }

    public boolean equals(String id) {
	return this.id.equalsIgnoreCase(id);
    }
}
