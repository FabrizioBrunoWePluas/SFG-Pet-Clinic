package UAccademy.Service.Map;

import UAccademy.Model.PetType;
import UAccademy.Service.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PetTypeMapService extends AbstractMapService<PetType, Long> implements PetTypeService {
    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(PetType objcet) {
        super.delete(objcet);
    }

    @Override
    public PetType save(PetType objcet) {
        return super.save(objcet);
    }

    @Override
    public PetType findById(Long id) {
        return super.findbyId(id);
    }
}
