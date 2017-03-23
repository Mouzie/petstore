package za.co.reverside.petstore;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class CartItem {

    @NotNull //Annotation used for validation
    //Item used to access the getTotal method found in the Item class. 
    //Item is calling the Item class that has the method getTotal
    private PetStore item;
    @NotNull
    @Min(1) //Min needs a default value
    private Integer quantity;

    //Constructor for class cart item
    public CartItem(PetStore item, Integer quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    //Getting sub total of items in the cart
    public Float getTotal() {
        return item.getPrice() * quantity;
    }
}
