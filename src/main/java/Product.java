import java.time.LocalDateTime;

public class Product {
    private Long id;
    private String brand;
    private String model;
    private Integer yearOfRealeas;
    private Double priceInEuro;
    private LocalDateTime dateOfReceving;

    public Product(Long id, String brand, String model, Integer yearOfRealeas, Double priceInEuro, LocalDateTime dateOfReceving) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.yearOfRealeas = yearOfRealeas;
        this.priceInEuro = priceInEuro;
        this.dateOfReceving = dateOfReceving;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYearOfRealeas() {
        return yearOfRealeas;
    }

    public void setYearOfRealeas(Integer yearOfRealeas) {
        this.yearOfRealeas = yearOfRealeas;
    }

    public Double getPriceInEuro() {
        return priceInEuro;
    }

    public void setPriceInEuro(Double priceInEuro) {
        this.priceInEuro = priceInEuro;
    }

    public LocalDateTime getDateOfReceving() {
        return dateOfReceving;
    }

    public void setDateOfReceving(LocalDateTime dateOfReceving) {
        this.dateOfReceving = dateOfReceving;
    }
}
