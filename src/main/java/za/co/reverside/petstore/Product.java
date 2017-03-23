package za.co.reverside.petstore;

public class Product {
    private String name;
    private String description;
    //Category is a class 
    private Category category;
    
    
    public Product(){
    }
    
    public Product(String name, String description, Category category){
        this.name = name;
        this.description = description;
        this.category = category;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getDescription(){
        return description;
    }
    
    public void setDescription(String description){
        this.description = description;
    }
    
    public Category getCategory(){
        return category;
    }
    
    public void setCategory(Category category){
        this.category = category;
    }
    
    public void addItem(PetStore petStore){
        
    }
}
