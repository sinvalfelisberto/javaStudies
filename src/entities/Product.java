package entities;

public class Product {
    private String name;
    private Double price;
    private Integer stock;

    public Product() {

    }

    public Product(String name, Double price, Integer stock) {
        setName(name);
        setPrice(price);
        addToStock(stock);
    }

    public Product(String name, Double price) {
        setName(name);
        setPrice(price);
        addToStock(0); // opcional: o java atribui 0 como padrão.
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getStock() {
        return this.stock;
    }

    public void addToStock(Integer quantity) {
        this.stock = quantity;
    }

    public void removeFromStock(Integer quantity) {
        this.stock -= quantity;
    }

    public Double getTotal() {
        return this.stock * this.price;
    }

    public String toString() {
        return getName()
                + ", $ "
                + String.format("%.2f", getPrice())
                + ", "
                + getStock()
                + " units, Total: $ "
                + String.format("%.2f", getTotal());
    }
}
