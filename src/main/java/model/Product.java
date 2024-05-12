package model;

public class Product implements Element {
	
	private Integer id;
	private String name;
	private String characteristic;
	private Double price;
	private Integer count;
	
	public Product(Integer id, String name, String characteristic, Double price, Integer count) {
		super();
		this.id = id;
		this.name = name;
		this.characteristic = characteristic;
		this.price = price;
		this.count = count;
	}

	public Product(String name, String characteristic, Double price, Integer count) {
		super();
		this.name = name;
		this.characteristic = characteristic;
		this.price = price;
		this.count = count;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCharacteristic() {
		return characteristic;
	}

	public void setCharacteristic(String characteristic) {
		this.characteristic = characteristic;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		if(price <= 0)
			throw new IllegalArgumentException();
		this.price = price;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		if(count < 0)
			throw new IllegalArgumentException();
		this.count = count;
	}

	@Override
	public Integer getId() {
		return this.id;
	}

	@Override
	public void setId(Integer id) {
		this.id = id;
	}

}
