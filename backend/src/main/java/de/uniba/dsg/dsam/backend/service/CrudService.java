/**
 * 
 */
package de.uniba.dsg.dsam.backend.service;

import java.util.List;

/**
 * @author noman
 *
 */
public interface CrudService<ENTITY> {
	ENTITY addOne(ENTITY entity);
	ENTITY updateOne(ENTITY entity);
	ENTITY getOne(Class<?> entityClass, int id);
	List<ENTITY> getByIds(Class<ENTITY> entityClass, List<Integer> ids);
	List<ENTITY> getAll(Class<?> entityClass);
	void deleteOne(ENTITY entity);
	void deleteAll();
}