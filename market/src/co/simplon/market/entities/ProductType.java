package co.simplon.market.entities;

public class ProductType {

    private String name;

    public ProductType(String name) {
	this.name = name;
    }

    public String getName() {
	return name;
    }

    @Override
    public String toString() {
	return "{name=" + name + "}";
    }

}
