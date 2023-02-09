package UAccademy.Service.Map;

import UAccademy.Model.Speciality;
import UAccademy.Model.Visit;
import UAccademy.Repository.VisitRepository;
import UAccademy.Service.SpecialityService;
import UAccademy.Service.VisitService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VisitMapService extends AbstractMapService<Visit, Long> implements VisitService {
    private final VisitRepository visitRepository;

    public VisitMapService(VisitRepository visitRepository) {
        this.visitRepository = visitRepository;
    }

    @Override
    public Set<Visit> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Visit findById(Long id) {
        return super.findbyId(id);
    }

    @Override
    public Visit save(Visit objcet) {

        if(objcet.getPet() == null || objcet.getPet().getOwner() == null || objcet.getPet().getId() == null){
            throw new RuntimeException("Invalid Visit");
        }else{
            return super.save(objcet);
        }
    }

    @Override
    public void delete(Visit objcet) {
        super.delete(objcet);
    }
}
