package UAccademy.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Table(name = "owners")
public class Owner extends Person{

    @Column(name = "address")
    private String address;

    @Column(name="city")
    private String city;

    @Column (name= "telephone")
    private String telephone;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
    private Set<Pet> pets = new HashSet<>();

    public Set<Pet> getPets(){
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }
}
