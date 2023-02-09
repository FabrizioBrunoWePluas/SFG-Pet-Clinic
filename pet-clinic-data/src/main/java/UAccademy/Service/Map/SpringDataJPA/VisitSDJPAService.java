package UAccademy.Service.Map.SpringDataJPA;

import UAccademy.Model.Speciality;
import UAccademy.Model.Visit;
import UAccademy.Repository.VisitRepository;
import UAccademy.Service.VisitService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("SpringDataJPA")
public class VisitSDJPAService implements VisitService {

    public final VisitRepository visitRepository;

    public VisitSDJPAService(VisitRepository visitRepository) {
        this.visitRepository = visitRepository;
    }

    public Set<Visit> findAll() {
        Set<Visit> visit = new HashSet<>();

        //The double colon (::) operator, also known as method reference operator in Java, is used to call a method by referring to it with the help of its class directly.
        // They behave exactly as the lambda expressions. The only difference it has from lambda expressions is that this uses direct
        // reference to the method by name instead of providing a delegate to the method.
        visitRepository.findAll().forEach(visit::add);

        return visit;
    }

    @Override
    public Visit findById(Long id) {
        return visitRepository.findById(id).orElse(null);
    }

    @Override
    public Visit save(Visit objcet) {
        return visitRepository.save(objcet);
    }

    @Override
    public void delete(Visit objcet) {
        visitRepository.delete(objcet);
    }

    @Override
    public void deleteById(Long id) {
        visitRepository.deleteById(id);
    }
}
