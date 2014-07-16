package br.com.oncast.codechallenge.common;

import java.io.Serializable;
import java.util.Collection;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * eduardo.bregaida
 */
public abstract class AbstractService<E, PK extends Serializable> {

    private MongoRepository<E, PK> repository;

    public MongoRepository<E, PK> getRepository() {
	return repository;
    }

    public void setRepository(MongoRepository<E, PK> repository) {
	this.repository = repository;
    }

    public void save(E entity) {
	getRepository().save(entity);
    }

    public E findById(PK primaryKey) {
	return getRepository().findOne(primaryKey);
    }

    public Collection<E> findAll() {
	return getRepository().findAll();
    }

    public Page<E> findAll(Pageable pageable) {
	return getRepository().findAll(pageable);
    }

    public Collection<E> findAllDesc() {
	final Sort sort = new Sort(Sort.Direction.ASC, getSortAttribute());
	return getRepository().findAll(sort);
    }

    public abstract String getSortAttribute();
}
