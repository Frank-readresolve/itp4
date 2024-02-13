package co.simplon.market;

import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {
	// Create 2 products of same type:
	Product apple = new Product("Fruit", "Apple", 0.49F);
	Product pear = new Product("Fruit", "Pear", 0.69F);
	Product beef = new Product("Meat", "Beef", 9.99F);
	// Create 1 item per created product
	ShoppingListItem itemOne = new ShoppingListItem(apple, 5);
	ShoppingListItem itemTwo = new ShoppingListItem(pear, 4);
	ShoppingListItem itemThree = new ShoppingListItem(beef, 2);
	// Create an ArrayList of type ShoppingListItem
	// ArrayList kind of dynamic array / bag / container
	ArrayList<ShoppingListItem> items = new ArrayList<>(); // array[n]
	items.add(itemOne); // array[0] = itemOne
	items.add(itemTwo); // array[1] = itemTwo
	items.add(itemThree); // array[2] = itemThree
	// printShoppingList(items);
	Client client = new Client("Frank", 10000, items);
	// System.out.println(client);
	Merchant merchant = new Merchant("Venise", "Olives", 1500);
	System.out.println(merchant);
    }

    private static void printShoppingList(ArrayList<ShoppingListItem> items) {
	System.out.println(items);
    }

}
