package price;

import java.util.ArrayList;
import java.util.List;

public class ProductPrice {
    private PriceType priceType;
    private List<Price> prices;

    public ProductPrice(PriceType priceType) {
        this.priceType = priceType;
        this.prices = new ArrayList<>();
    }

    public PriceType getPriceType() {
        return priceType;
    }

    public void setPriceType(PriceType priceType) {
        this.priceType = priceType;
    }

    public List<Price> getPrices() {
        return prices;
    }

    public void setPrices(List<Price> prices) {
        this.prices = prices;
    }

    public void addPrice(Price price){
        prices.add(price);
    }

    @Override
    public String toString() {
        return "ProductPrice{" +
                "priceType=" + priceType +
                ", prices=" + prices +
                '}';
    }
}
