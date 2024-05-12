package database;

import java.util.TreeMap;

import dao.ElementDao;
import model.Category;
import model.Element;
import model.Product;

public class TestDatabaseCreator {
	public static void create(ElementDao ed) {
		TreeMap<Integer, Element> tm1 = new TreeMap<Integer, Element>();
		tm1.put(1, new Product(1, "", "", 0.0, 0));
		tm1.put(2, new Product(2, "", "", 0.0, 0));
		tm1.put(3, new Product(3, "", "", 0.0, 0));
		tm1.put(4, new Product(4, "", "", 0.0, 0));
		tm1.put(5, new Product(5, "", "", 0.0, 0));
		tm1.put(6, new Product(6, "", "", 0.0, 0));
		tm1.put(7, new Product(7, "", "", 0.0, 0));
		tm1.put(8, new Product(8, "", "", 0.0, 0));
		tm1.put(9, new Product(9, "", "", 0.0, 0));

		ed.create(new Category("Books", tm1));
		
		TreeMap<Integer, Element> tm2 = new TreeMap<>();
		TreeMap<Integer, Element> subtm1 = new TreeMap<>();
		subtm1.put(1, new Product(1, "", "", 0.0, 0));
		subtm1.put(2, new Product(2, "", "", 0.0, 0));
		subtm1.put(3, new Product(3, "", "", 0.0, 0));
		subtm1.put(4, new Product(4, "", "", 0.0, 0));
		subtm1.put(5, new Product(5, "", "", 0.0, 0));
		subtm1.put(6, new Product(6, "", "", 0.0, 0));
		subtm1.put(7, new Product(7, "", "", 0.0, 0));
		
		TreeMap<Integer, Element> subtm2 = new TreeMap<>();
		subtm2.put(1, new Product(1, "", "", 0.0, 0));
		subtm2.put(2, new Product(2, "", "", 0.0, 0));
		subtm2.put(3, new Product(3, "", "", 0.0, 0));
		subtm2.put(4, new Product(4, "", "", 0.0, 0));
		subtm2.put(5, new Product(5, "", "", 0.0, 0));
		subtm2.put(6, new Product(6, "", "", 0.0, 0));
		subtm2.put(7, new Product(7, "", "", 0.0, 0));
		subtm2.put(8, new Product(8, "", "", 0.0, 0));

		TreeMap<Integer, Element> subtm3 = new TreeMap<>();
		subtm3.put(1, new Product(1, "", "", 0.0, 0));
		subtm3.put(2, new Product(2, "", "", 0.0, 0));
		subtm3.put(3, new Product(3, "", "", 0.0, 0));
		subtm3.put(4, new Product(4, "", "", 0.0, 0));
		subtm3.put(5, new Product(5, "", "", 0.0, 0));

		tm2.put(1, new Category(1, "", subtm1));
		tm2.put(2, new Category(2, "", subtm2));
		tm2.put(3, new Category(3, "", subtm3));
		
		ed.create(new Category("Technique", tm2));
	}
}
