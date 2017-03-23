package za.co.reverside.petstore;

public class Item {

    private String name;
    private Float unitCost;
    //Product class that has the prouct information
    private Product product;
    private String description;

    public Item() {
    }

    public Item(String name, Float unitCost, Product product, String description) {
        this.name = name;
        this.unitCost = unitCost;
        this.product = product;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(Float unitCost) {
        this.unitCost = unitCost;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
