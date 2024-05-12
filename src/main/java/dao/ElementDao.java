package dao;

import java.util.Collection;
import model.Element;

public interface ElementDao {
	void create(Element e);
	Element findById(Integer id);
	Collection<Element> findAll();
	void update(Element e);
	void deleteById(Integer id);
}
