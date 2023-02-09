package UAccademy.Service.Map.SpringDataJPA;

import UAccademy.Model.Pet;
import UAccademy.Model.Speciality;
import UAccademy.Repository.SpecialtyRepository;
import UAccademy.Service.SpecialityService;
import org.springframework.context.annotation.Profile;
import org.springframework.data.annotation.ReadOnlyProperty;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("SpringDataJPA")
public class VetSpecilatySDJPAService implements SpecialityService{

    private final SpecialtyRepository specialtyRepository;

    public VetSpecilatySDJPAService(SpecialtyRepository specialtyRepository) {
        this.specialtyRepository = specialtyRepository;
    }

    @Override
    public Set<Speciality> findAll() {
        Set<Speciality> specialities = new HashSet<>();

        //The double colon (::) operator, also known as method reference operator in Java, is used to call a method by referring to it with the help of its class directly.
        // They behave exactly as the lambda expressions. The only difference it has from lambda expressions is that this uses direct
        // reference to the method by name instead of providing a delegate to the method.
        specialtyRepository.findAll().forEach(specialities::add);

        return specialities;
    }

    @Override
    public Speciality findById(Long id) {
        return specialtyRepository.findById(id).orElse(null);
    }

    @Override
    public Speciality save(Speciality objcet) {
        return specialtyRepository.save(objcet);
    }

    @Override
    public void delete(Speciality objcet) {
        specialtyRepository.delete(objcet);
    }

    @Override
    public void deleteById(Long id) {
        specialtyRepository.deleteById(id);
    }
}
