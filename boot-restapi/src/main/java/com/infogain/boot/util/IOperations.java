package com.infogain.boot.util;

import java.util.List;

public interface IOperations<T> {

	T find(final T entity, final Long id, String condition);

	List<T> fetchAll(final T entity, String condition);

	void create(final T entity);

	void update(final T entity);

	void delete(final T entity);
}
