package UAccademy.Repository;

import UAccademy.Model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepositry extends CrudRepository<Pet, Long> {



}
