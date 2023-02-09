package UAccademy.Service.Map.SpringDataJPA;

import UAccademy.Model.Owner;
import UAccademy.Model.Vet;
import UAccademy.Repository.VetRepository;
import UAccademy.Service.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("SpringDataJPA")
public class VetSDJPAService implements VetService {

    private final VetRepository vetRepository;

    public VetSDJPAService(VetRepository vetRepository) {
        this.vetRepository = vetRepository;
    }

    @Override
    public Set<Vet> findAll() {
        Set<Vet> vets = new HashSet<>();

        //The double colon (::) operator, also known as method reference operator in Java, is used to call a method by referring to it with the help of its class directly.
        // They behave exactly as the lambda expressions. The only difference it has from lambda expressions is that this uses direct
        // reference to the method by name instead of providing a delegate to the method.
        vetRepository.findAll().forEach(vets::add);

        return vets;
    }

    @Override
    public Vet findById(Long id) {
        return vetRepository.findById(id).orElse(null);
    }

    @Override
    public Vet save(Vet objcet) {
        return vetRepository.save(objcet);
    }

    @Override
    public void delete(Vet objcet) {
        vetRepository.delete(objcet);
    }

    @Override
    public void deleteById(Long id) {
        vetRepository.deleteById(id);
    }
}
