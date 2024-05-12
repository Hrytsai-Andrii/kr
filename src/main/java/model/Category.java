package model;

import java.util.Collection;
import java.util.TreeMap;

public class Category implements Element {

	private Integer id;
	private String name;
	private TreeMap<Integer, Element> elements;
	
	public Category(String name, TreeMap<Integer, Element> elements) {
		super();
		this.name = name;
		this.elements = elements;
	}

	public Category(Integer id, String name, TreeMap<Integer, Element> elements) {
		super();
		this.id = id;
		this.name = name;
		this.elements = elements;
	}

	@Override
	public Integer getId() {
		return this.id;
	}

	@Override
	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TreeMap<Integer, Element> getElements() {
		return elements;
	}

	public void setElements(TreeMap<Integer, Element> elements) {
		this.elements = elements;
	}
	
	//CRUD
	
	void create(Element e) {
		int id = elements.isEmpty() ? 1 : elements.lastKey() + 1;
		e.setId(id);
		elements.put(id, e); 
	}
	
	Element findById(Integer id) {
		return elements.get(id);
	}
	
	public Collection<Element> findAll() {
		return elements.values();
	}
	
	void update(Element e) {
		elements.put(e.getId(),e);
	}
	
	void deleteById(Integer id) {
		elements.remove(id);
	}

}
