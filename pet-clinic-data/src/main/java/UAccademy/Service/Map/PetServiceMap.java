package UAccademy.Service.Map;


import UAccademy.Model.Pet;
import UAccademy.Service.PetService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet objcet) {
        super.delete(objcet);
    }

    @Override
    public Pet findById(Long id) {
        return super.findbyId(id);
    }

    @Override
    public Pet save(Pet objcet) {
        return super.save(objcet.getId(), objcet);
    }
}
