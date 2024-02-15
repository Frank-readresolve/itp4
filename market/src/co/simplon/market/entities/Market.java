package co.simplon.market.entities;

import java.util.List;

public class Market {

    private List<Client> clients;

    private List<Merchant> merchants;

    public Market(List<Client> clients, List<Merchant> merchants) {
	this.clients = clients;
	this.merchants = merchants;
    }

    public List<Client> getClients() {
	return clients;
    }

    public List<Merchant> getMerchants() {
	return merchants;
    }

    public boolean open() {
	for (Client client : clients) { // for each client in clients
	    List<ShoppingListItem> items = client.getItems();
	    for (ShoppingListItem item : items) {
		Product product = item.getProduct();
		ProductType clientType = product.getType();
		String clientTypeName = clientType.getName();
		for (Merchant merchant : merchants) {
		    ProductType merchantType = merchant.getType();
		    String merchantTypeName = merchantType.getName();
		    if (clientTypeName.equals(merchantTypeName)) {
			String output = client.getName() + " wants to buy " + item.getQuantity() + " of "
				+ product.getName() + " from " + merchant.getName() + " at the price of €"
				+ product.getPrice() + "!";
			System.out.println(output);
		    }
		}
	    }
	}
	return true;
    }

    @Override
    public String toString() {
	return "{clients=" + clients + ", merchants=" + merchants + "}";
    }

}
