package price;

import java.util.ArrayList;
import java.util.List;

public class CalculatePrice {
    private static final Integer CURRENCY_VALUE = 5;
    private static final Integer NUMBERS_OF_RATE = 6;
    private static CalculatePrice calculatePrice = new CalculatePrice();

    private CalculatePrice(){

    }
    public static CalculatePrice getInstance(){
        return calculatePrice;

    }


    private ProductPrice getProductPrice(Double price, PriceType type) {
        Price priceInEuro = new Price(Currency.EURO, price);
        Price priceInRon = ronPrice(price);
        ProductPrice productPrice = new ProductPrice(type);
        productPrice.addPrice(priceInEuro);
        productPrice.addPrice(priceInRon);
        return productPrice;
    }

    private ProductPrice getProductPriceRate(Double price) {
        Double priceOfRate = price/NUMBERS_OF_RATE;
        return getProductPrice(priceOfRate, PriceType.RATE);
    }

    public List<ProductPrice> getProductPrices(Double priceInEuro){
        List<ProductPrice> productPrices = new ArrayList<>();
        productPrices.add(calculatePrice.getProductPrice(priceInEuro, PriceType.STANDARD));
        productPrices.add(calculatePrice.getProductPriceRate(priceInEuro));
        return productPrices;
    }
    private Price ronPrice(Double priceInEuro) {
        return new Price(Currency.RON, priceInEuro * CURRENCY_VALUE);
    }
}
