package UAccademy.Service.Map;

import UAccademy.Model.Speciality;
import UAccademy.Service.SpecialityService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
@Profile({"default","map"})
public class SpecialityMapService extends AbstractMapService<Speciality, Long> implements SpecialityService {

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
