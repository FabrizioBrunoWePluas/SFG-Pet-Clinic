package UAccademy.Repository;

import UAccademy.Model.PetType;
import org.springframework.data.repository.CrudRepository;

import javax.sql.rowset.CachedRowSet;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {



}
