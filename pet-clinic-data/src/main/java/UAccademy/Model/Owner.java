package UAccademy.Model;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Data
@Entity
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

}
