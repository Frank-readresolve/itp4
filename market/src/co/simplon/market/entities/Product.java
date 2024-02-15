package co.simplon.market.entities;

public class Product {
    private ProductType type;
    private String name;
    private float price;

    public Product(ProductType type, String name, float price) {
	this.type = type;
	this.name = name;
	this.price = price;
    }

    public ProductType getType() {
	return type;
    }

    public String getName() {
	return name;
    }

    public float getPrice() {
	return price;
    }

    @Override
    public String toString() {
	return "{type=" + type + ", name=" + name + ", price=" + price + "}";
    }

}
