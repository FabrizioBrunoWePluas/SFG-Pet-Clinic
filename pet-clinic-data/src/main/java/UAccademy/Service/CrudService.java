package UAccademy.Service;

import java.util.Set;

//T = Type, cioè la la classe/modello che gli passiamo
//ID =  ID, cioè il tipo di variabile che dia diamo ad ID
public interface CrudService <T, ID>{
    Set<T> findAll();

    T findById(ID id);

    T save(T objcet);

    void delete(T objcet);

    void deleteById(ID id);
}
