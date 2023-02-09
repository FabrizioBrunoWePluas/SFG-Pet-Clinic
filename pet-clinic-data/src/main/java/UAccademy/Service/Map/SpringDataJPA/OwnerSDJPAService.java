package UAccademy.Service.Map.SpringDataJPA;

import UAccademy.Model.Owner;
import UAccademy.Repository.OwnerRepository;
import UAccademy.Repository.PetRepositry;
import UAccademy.Repository.PetTypeRepository;
import UAccademy.Service.OwnerService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
@Profile("SpringDataJPA")
public class OwnerSDJPAService implements OwnerService {

    private final OwnerRepository ownerRepository;
    private final PetRepositry petRepositry;
    private final PetTypeRepository petTypeRepository;



    public OwnerSDJPAService(OwnerRepository ownerRepository, PetRepositry petRepositry, PetTypeRepository petTypeRepository) {
        this.ownerRepository = ownerRepository;
        this.petRepositry = petRepositry;
        this.petTypeRepository = petTypeRepository;
    }

    @Override
    public Set<Owner> findAll() {
        Set<Owner> owners = new HashSet<>();

        //The double colon (::) operator, also known as method reference operator in Java, is used to call a method by referring to it with the help of its class directly.
        // They behave exactly as the lambda expressions. The only difference it has from lambda expressions is that this uses direct
        // reference to the method by name instead of providing a delegate to the method.
        ownerRepository.findAll().forEach(owners::add);

        return owners;
    }

    @Override
    public Owner findById(Long id) {
        return ownerRepository.findById(id).orElse(null);
    }

    @Override
    public Owner save(Owner object) {

        System.out.println("#######################");
        System.out.println("#######################");
        System.out.println("#######################");
        System.out.println("#######################");

        return ownerRepository.save(object);
    }

    @Override
    public void delete(Owner object) {
        ownerRepository.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        ownerRepository.deleteById(id);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return ownerRepository.findByLastName(lastName);
    }
}
