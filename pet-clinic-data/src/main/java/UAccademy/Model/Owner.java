package UAccademy.Model;

import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
public class Owner extends Person{

    private String address;
    private String city;
    private String telephone;
    private Set<Pet> pets = new HashSet<>();

    public Set<Pet> getPets(){
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }
}
