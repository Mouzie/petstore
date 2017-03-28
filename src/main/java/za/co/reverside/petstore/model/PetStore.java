package za.co.reverside.petstore.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class PetStore {
    
    @Id
    private String id;
    
    private String size;
    private String type;
    private String color;
    private String description;
    private double price;
    
}
