package UAccademy.Service.Map;

import UAccademy.Model.Owner;
import UAccademy.Model.Pet;
import UAccademy.Service.OwnerService;
import UAccademy.Service.PetService;
import UAccademy.Service.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;


@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long>  implements OwnerService {

    private final PetTypeService petTypeService;
    private final PetService petService;

    public OwnerServiceMap(PetTypeService petTypeService, PetService petService) {
        this.petTypeService = petTypeService;
        this.petService = petService;
    }


    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public Owner findById(Long id) {
        return super.findbyId(id);
    }


    //Questo metodo controlla se:
    @Override
    public Owner save( Owner object) {
        //-esiste un oggetto Owner
        if(object != null){
            //-controlla se ha un pet
            if(object.getPets() != null){
                //Se esistono, per ogni Owner che ha un pet fa:
                object.getPets().forEach( pet -> {
                    //controlla se il pet dell'owner ha un PetType
                    if(pet.getPetType() != null){
                        //controlla se il pet ha un id
                        if(pet.getPetType().getId() != null){
                            // Salva il petType del pet dell'owner
                            pet.setPetType(petTypeService.save(pet.getPetType()));
                        }else{
                            throw new RuntimeException("Object cannot be null");
                        }
                    }

                    if(pet.getId()==null){
                        Pet savedPet = petService.save(pet);
                        pet.setId(savedPet.getId());
                    }
                });
            }
            return super.save(object);
        }
        else{
            return null;
        }
    }

    @Override
    public Owner findByLastName(String lastName) {
        return findByLastName(lastName);
    }
}
