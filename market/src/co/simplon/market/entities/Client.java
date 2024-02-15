package co.simplon.market.entities;

import java.util.List;

public class Client {

    private String name;
    private float budget;
    private List<ShoppingListItem> items;

    // constructor
    public Client(String name, float budget, List<ShoppingListItem> items) {
	this.name = name;
	this.budget = budget;
	this.items = items;
    }

    public String getName() {
	return name;
    }

    public float getBudget() {
	return budget;
    }

    public List<ShoppingListItem> getItems() {
	return items;
    }

    @Override
    public String toString() {
	return "{name=" + name + ", budget=" + budget + ", items=" + items + "}";
    }

}
