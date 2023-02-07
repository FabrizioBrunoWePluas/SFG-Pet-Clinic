package UAccademy.Service.Map;

import UAccademy.Model.Owner;
import UAccademy.Service.OwnerService;
import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner, Long>  implements OwnerService {


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

    @Override
    public Owner findByLastName(String lastName) {
        return findByLastName(lastName);
    }
}
