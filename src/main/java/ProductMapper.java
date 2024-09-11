import price.*;

import java.util.ArrayList;
import java.util.List;

/*
 * Creaza o clasa ProductMapper care returneaza un obiect de tipul ProductDto ce contine urmatoarele fielduri:
 * - id-ul produsului
 * - titlul produsului care este un string format de tipul brand + model + yearOfRelease
 * - prices este o lista ce contine
 * - pretul standard in euro si ron
 * - pretul in rate in euro si ron
 * Foloseste cursul valutar 1 eur = 5 lei.
 */
public class ProductMapper {
    CalculatePrice calculatePrice = CalculatePrice.getInstance();

    public ProductDto mapToProductDto(Product product) {
        String idInString = product.getId().toString();
        String title = getTitle(product);
        List<ProductPrice> productPrices = calculatePrice.getProductPrices(product.getPriceInEuro());
        return new ProductDto(idInString, title, productPrices);
    }


    private String getTitle(Product product) {
        if (product.getBrand() != null) {
            return product.getBrand()
                    .concat(", " + product.getModel() + ", ")
                    .concat(product.getYearOfRealeas().toString());
        }
        return "";
    }


}
