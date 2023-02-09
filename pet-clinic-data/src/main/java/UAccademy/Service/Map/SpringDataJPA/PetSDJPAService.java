package UAccademy.Service.Map.SpringDataJPA;

import UAccademy.Model.Pet;
import UAccademy.Model.PetType;
import UAccademy.Repository.PetRepositry;
import UAccademy.Service.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("SpringDataJPA")
public class PetSDJPAService implements PetService {

    private final PetRepositry petRepositry;

    public PetSDJPAService(PetRepositry petRepositry) {
        this.petRepositry = petRepositry;
    }

    @Override
    public Set<Pet> findAll() {
        Set<Pet> pet = new HashSet<>();

        //The double colon (::) operator, also known as method reference operator in Java, is used to call a method by referring to it with the help of its class directly.
        // They behave exactly as the lambda expressions. The only difference it has from lambda expressions is that this uses direct
        // reference to the method by name instead of providing a delegate to the method.
        petRepositry.findAll().forEach(pet::add);

        return pet;
    }

    @Override
    public Pet findById(Long id) {
        return petRepositry.findById(id).orElse(null);
    }

    @Override
    public Pet save(Pet objcet) {
        return petRepositry.save(objcet);
    }

    @Override
    public void delete(Pet objcet) {
        petRepositry.delete(objcet);
    }

    @Override
    public void deleteById(Long id) {
        petRepositry.deleteById(id);
    }
}
