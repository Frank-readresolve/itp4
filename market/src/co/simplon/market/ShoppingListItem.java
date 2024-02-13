package co.simplon.market;

public class ShoppingListItem {

    private Product product;

    private int quantity;

    public ShoppingListItem(Product product, int quantity) {
	this.product = product;
	this.quantity = quantity;
    }

    public Product getProduct() {
	return product;
    }

    public int getQuantity() {
	return quantity;
    }

    @Override
    public String toString() {
	return "{product=" + product + ", quantity=" + quantity + "}";
    }

}
