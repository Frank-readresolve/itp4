package co.simplon.market;

import co.simplon.market.entities.Market;
import co.simplon.market.utilities.MarketUtils;

public class Application {

    public static void main(String[] args) {
	// MarketUtils utils = new MarketUtils();
	Market market = MarketUtils.buildMarket();
	market.open();
    }

}
