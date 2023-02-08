package UAccademy.Service.Map;

import UAccademy.Model.Speciality;
import UAccademy.Service.SpecialitiesService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class SpecialityMapService extends AbstractMapService<Speciality, Long> implements SpecialitiesService {

    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Speciality objcet) {
        super.delete(objcet);
    }

    @Override
    public Speciality save(Speciality objcet) {
        return super.save(objcet);
    }

    @Override
    public Speciality findById(Long id) {
        return super.findbyId(id);
    }
}
