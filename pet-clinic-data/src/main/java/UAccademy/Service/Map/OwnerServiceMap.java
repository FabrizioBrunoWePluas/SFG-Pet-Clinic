package UAccademy.Service.Map;

import UAccademy.Model.Owner;
import UAccademy.Service.CrudService;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long>{


    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner objcet) {
        super.delete(objcet);
    }

    @Override
    public Owner findById(Long id) {
        return super.findbyId(id);
    }

    @Override
    public Owner save( Owner objcet) {
        return super.save(objcet.getId(), objcet);
    }
}
