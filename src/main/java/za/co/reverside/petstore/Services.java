package za.co.reverside.petstore;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Services {

    //Instant variable created to store values 
    private final List<PetStore> pets = new ArrayList<>(); 

    //Creating a new pet
    @RequestMapping(path = "api/pets", method = RequestMethod.POST, consumes = "application/json")
    public void creatPet(@RequestBody PetStore pet) {
        this.pets.add(pet);
    }

    //Finding all the pets that are found in the store
    @RequestMapping(path = "api/pets", method = RequestMethod.GET, produces = "application/json")
    public List<PetStore> findAllPets() {
        return this.pets;
    }

    //Find pet by ID
    @RequestMapping(path = "api/pets/{id}", method = RequestMethod.GET, produces = "application/json")
    public PetStore findOnePet(@PathVariable("id") String id) {
        //Local variable to store pet that has been found
        PetStore pet = null;

        //Loo to go through the Array of pets
        for (PetStore aPet : pets) {
            if (aPet.getId().equals(id)) {
                pet = aPet;
            } else {
            }
        }
        return pet;
    }

    //Update Pet
    @RequestMapping(path = "api/pets/{id}", method = RequestMethod.PUT)
    public void updatePet(@RequestBody PetStore pet, @PathVariable("id") String id) {

        for (PetStore aPet : pets) {
            if (aPet.getId().equals(id)) {
                pet = aPet;
            }
            this.pets.set(Integer.parseInt(id), pet);
        }
    }
    
    //Delete pet
    @RequestMapping(path="api/pets/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") String id){
        PetStore pet = null;
        for (PetStore aPet : pets) {
            if (aPet.getId().equals(id))
                pet = aPet;
        }
        this.pets.remove(pet);
    }
  }
