import java.time.LocalDateTime;

/*
Creaza o clasa Product cu fieldurile (id, brand, model, yearOfRelease, priceInEur);
Creaza o clasa ProductMapper care returneaza un obiect de tipul ProductDto ce contine urmatoarele fielduri:
 - id-ul produsului
 - titlul produsului care este un string format de tipul brand + model + yearOfRelease
 - prices este o lista ce contine
   - pretul standard in euro si ron
   - pretul in rate in euro si ron
Foloseste cursul valutar 1 eur = 5 lei.
 */
public class Main {
    public static void main(String[] args) {
       Product product = new Product(65456L, "Apple", "Iphone 16", 2024, 2400.0, LocalDateTime.now());
       Product product2 = new Product(65456L, null, "Iphone 15", 2024, 1500.0, LocalDateTime.now());
       ProductMapper productMapper = new ProductMapper();
       ProductDto productDto = productMapper.mapToProductDto(product);
       ProductDto productDto1 = productMapper.mapToProductDto(product2);
        System.out.println(productDto);
        System.out.println();
        System.out.println();
        System.out.println(productDto1);
    }
}
