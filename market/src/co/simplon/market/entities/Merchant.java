package co.simplon.market.entities;

public class Merchant {

    private String name;
    private ProductType type;
    private int stock;

    public Merchant(String name, ProductType type, int stock) {
	this.name = name;
	this.type = type;
	this.stock = stock;
    }

    public String getName() {
	return name;
    }

    public ProductType getType() {
	return type;
    }

    public int getStock() {
	return stock;
    }

    @Override
    public String toString() {
	return "{name=" + name + ", type=" + type + ", stock=" + stock + "}";
    }
}
