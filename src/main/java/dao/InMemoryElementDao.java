package dao;

import java.util.Collection;
import java.util.TreeMap;

import model.Element;

public class InMemoryElementDao implements ElementDao {

	private TreeMap<Integer, Element> elements = new TreeMap<>();
	
	@Override
	public void create(Element e) {
		int id = elements.isEmpty() ? 1 : elements.lastKey() + 1;
		e.setId(id);
		elements.put(id, e);
	}

	@Override
	public Element findById(Integer id) {
		return elements.get(id);
	}

	@Override
	public Collection<Element> findAll() {
		return elements.values();
	}

	@Override
	public void update(Element e) {
		elements.put(e.getId(),e);
	}

	@Override
	public void deleteById(Integer id) {
		elements.remove(id);
	}

}
