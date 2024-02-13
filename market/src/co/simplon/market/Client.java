package co.simplon.market;

import java.util.ArrayList;

public class Client {

    private String name;
    private float budget;
    private ArrayList<ShoppingListItem> items;

    // constructor
    public Client(String name, float budget, ArrayList<ShoppingListItem> items) {
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

    public ArrayList<ShoppingListItem> getItems() {
	return items;
    }

    @Override
    public String toString() {
	return "{name=" + name + ", budget=" + budget + ", items=" + items + "}";
    }

}
