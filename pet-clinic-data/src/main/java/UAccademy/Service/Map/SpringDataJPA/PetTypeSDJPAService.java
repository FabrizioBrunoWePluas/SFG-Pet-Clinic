package UAccademy.Service.Map.SpringDataJPA;

import UAccademy.Model.PetType;
import UAccademy.Model.Vet;
import UAccademy.Repository.PetTypeRepository;
import UAccademy.Service.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("SpringDataJPA")
public class PetTypeSDJPAService implements PetTypeService {

    private final PetTypeRepository petTypeRepository;

    public PetTypeSDJPAService(PetTypeRepository petTypeRepository) {
        this.petTypeRepository = petTypeRepository;
    }

    @Override
    public Set<PetType> findAll() {
        Set<PetType> petTypes = new HashSet<>();

        //The double colon (::) operator, also known as method reference operator in Java, is used to call a method by referring to it with the help of its class directly.
        // They behave exactly as the lambda expressions. The only difference it has from lambda expressions is that this uses direct
        // reference to the method by name instead of providing a delegate to the method.
        petTypeRepository.findAll().forEach(petTypes::add);

        return petTypes;
    }

    @Override
    public PetType findById(Long id) {
        return petTypeRepository.findById(id).orElse(null);
    }

    @Override
    public PetType save(PetType objcet) {
        return petTypeRepository.save(objcet);
    }

    @Override
    public void delete(PetType objcet) {
        petTypeRepository.delete(objcet);
    }

    @Override
    public void deleteById(Long id) {
        petTypeRepository.deleteById(id);
    }
}
