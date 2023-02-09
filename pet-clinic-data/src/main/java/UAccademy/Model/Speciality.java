package UAccademy.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "specialities")
public class Speciality extends BaseEntity{

    @Column(name = "description")
    private String description;

}
