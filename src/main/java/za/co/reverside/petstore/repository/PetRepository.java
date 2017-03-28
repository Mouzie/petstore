
package za.co.reverside.petstore.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import za.co.reverside.petstore.model.PetStore;

@Repository
public interface PetRepository extends MongoRepository<PetStore, String>{
    
}
