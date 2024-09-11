import price.ProductPrice;

import java.util.List;

public class ProductDto {
    private String id;
    private String title;
    private List<ProductPrice> productPrices;

    public ProductDto(String id, String title, List<ProductPrice> productPrices) {
        this.id = id;
        this.title = title;
        this.productPrices = productPrices;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<ProductPrice> getProductPrices() {
        return productPrices;
    }

    public void setProductPrices(List<ProductPrice> productPrices) {
        this.productPrices = productPrices;
    }

    @Override
    public String toString() {
        return "ProductDto{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", productPrices=" + productPrices +
                '}';
    }
}
