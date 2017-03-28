package za.co.reverside.petstore.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import za.co.reverside.petstore.model.PetStore;
import za.co.reverside.petstore.repository.PetRepository;

@RestController
public class Service {
    
    @Autowired
    private PetRepository repository;

    @RequestMapping(value = "api/pets", method = RequestMethod.POST, consumes = "application/json")
    public void creatPet(@RequestBody PetStore pet) {
        this.repository.insert(pet);
    }

    @RequestMapping(value = "api/pets", method = RequestMethod.GET, produces = "application/json")
    public List<PetStore> findAllPets() {
        return this.repository.findAll();
    }

    @RequestMapping(path = "api/pets/{id}", method = RequestMethod.GET, produces = "application/json")
    public PetStore findOnePet(@PathVariable("id") String id) {
        PetStore pet = this.repository.findOne(id);

        return pet;
    }
    
    @RequestMapping(path = "api/pets/{id}", method = RequestMethod.PUT)
    public void updatePet(@RequestBody PetStore pet, @PathVariable("id") String id) {
        PetStore pets = this.repository.findOne(id);
        
            if(pets != null){
               pets.setSize(pet.getSize());
               pets.setColor(pet.getColor());
               pets.setDescription(pet.getDescription());
               pets.setType(pet.getType());
               pets.setPrice(pet.getPrice());
            }
            this.repository.save(pets);
        }
    
    @RequestMapping(path="api/pets/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") String id){
        
        List<PetStore> pets = repository.findAll();
        
        PetStore pet = null;
        for (PetStore aPet : pets) {
            if (aPet.getId().equals(id))
                pet = aPet;
        }
        this.repository.delete(pet);
    }
}
