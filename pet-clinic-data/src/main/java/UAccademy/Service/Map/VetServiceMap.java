package UAccademy.Service.Map;


import UAccademy.Model.Vet;
import UAccademy.Service.VetService;

import java.util.Set;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {


    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet objcet) {
        super.delete(objcet);
    }

    @Override
    public Vet findById(Long id) {
        return super.findbyId(id);
    }

    @Override
    public Vet save( Vet objcet) {
        return super.save(objcet.getId(), objcet);
    }
}
