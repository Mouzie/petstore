
package za.co.reverside.petstore;


public class PetStore {
    
    private String id;
    private String size;
    private String type;
    private String color;
    //If duplicates occur remove variables and keep those in the Item class.
    private String description;
    private Float price;
    private Float unitCost;
    
     
    public PetStore(){
    }
    
    public PetStore(String id, String size, String type, String color,String description, Float price, Float unitCost){
        this.id = id;
        this.type = type;
        this.color = color;
        this.size = size;
        this.description = description;
        this.price = price;
        this.unitCost = unitCost;
        
    }
    
    public String getId(){
        return id;
    }
    
    public void setId(String id){
        this.id = id;
    }
    
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public String getDescription(){
        return description;
    }
    
    public void setDescription(String description){
        this.description = description;
    }
    
    public Float getPrice(){
        return price;
    }
    public void setPrice(Float price){
        this.price = price;
    }
    
    public Float getUnitCost(){
        return unitCost;
    }
    public void setUnitCost(Float unitCost){
        this.unitCost = unitCost;
    }
}
