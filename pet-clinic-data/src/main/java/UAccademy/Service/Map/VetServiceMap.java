package UAccademy.Service.Map;


import UAccademy.Model.Vet;
import UAccademy.Service.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
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
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public Vet findById(Long id) {
        return super.findbyId(id);
    }

    @Override
    public Vet save( Vet object) {
        return super.save(object);
    }
}
