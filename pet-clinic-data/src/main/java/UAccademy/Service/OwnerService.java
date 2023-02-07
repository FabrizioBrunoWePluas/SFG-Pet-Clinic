package UAccademy.Service;

import UAccademy.Model.Owner;
import UAccademy.Model.Person;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);


}
