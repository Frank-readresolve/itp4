package co.simplon.market.utilities;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import co.simplon.market.entities.Client;
import co.simplon.market.entities.Market;
import co.simplon.market.entities.Merchant;
import co.simplon.market.entities.Product;
import co.simplon.market.entities.ProductType;
import co.simplon.market.entities.ShoppingListItem;

// Utility class: no state (instance fields)
// "No constructor": not instantiable
// Provides only static utility fields and/or methods
public class MarketUtils { // Convention: suffixed by Utils

    private static final ProductType FISH = new ProductType("Fish");

    // Class constants naming convention: SNAKE_CASE
    private static final ProductType FRUIT = new ProductType("Fruit");

    private static final ProductType MEAT = new ProductType("Meat");

    private static final ThreadLocalRandom RANDOM = ThreadLocalRandom.current();

    // In Java compiler adds by default
    // a no-arg public constructor

    // Java best practice in utility classes
    private MarketUtils() {
	// Not instantiable class
    }

    // List of clients
    // List of merchants
    public static Market buildMarket() {
	List<Client> clients = buildClients();
	List<Merchant> merchants = buildMerchants();
	return new Market(clients, merchants);
    }

    private static List<Client> buildClients() {
	Client first = buildClient("Roger", 100);
	Client second = buildClient("Samanta", 120);
	return List.of(first, second);
    }

    private static Client buildClient(String name, float budget) {
	Product apple = new Product(FRUIT, "Apple", 3.0F);
	Product beef = new Product(MEAT, "Beef", 9.0F);
	int quantity = RANDOM.nextInt(1, 5); // Random int [1, 5[
	ShoppingListItem firstItem = new ShoppingListItem(apple, quantity);
	ShoppingListItem secondItem = new ShoppingListItem(beef, RANDOM.nextInt(1, 5));
	List<ShoppingListItem> items = List.of(firstItem, secondItem);
	return new Client(name, budget, items);
    }

    private static List<Merchant> buildMerchants() {
	Merchant fruitMerchant = new Merchant("Bob", FRUIT, 100);
	Merchant meatMerchant = new Merchant("Alice", MEAT, 50);
	return List.of(meatMerchant, fruitMerchant);
    }

}
