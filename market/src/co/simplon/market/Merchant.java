package co.simplon.market;

public class Merchant {

    private String name;
    private String type;
    private int stock;

    public Merchant(String name, String type, int stock) {
	this.name = name;
	this.type = type;
	this.stock = stock;
    }

    public String getName() {
	return name;
    }

    public String getType() {
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
