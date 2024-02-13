package co.simplon.market;

public class Product {
    private String type;
    private String name;
    private float price;

    public Product(String type, String name, float price) {
	this.type = type;
	this.name = name;
	this.price = price;
    }

    public String getType() {
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
