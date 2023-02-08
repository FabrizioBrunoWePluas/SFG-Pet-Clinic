package UAccademy.BootStrap;

import UAccademy.Model.Owner;
import UAccademy.Model.Pet;
import UAccademy.Model.PetType;
import UAccademy.Model.Vet;
import UAccademy.Service.OwnerService;
import UAccademy.Service.PetTypeService;
import UAccademy.Service.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    //Lezione 122, minuto 2:19
    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType saveDogType = petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("Cat");
        PetType saveCatType = petTypeService.save(cat);

        //Owner
        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        owner1.setAddress("123 Brickerel");
        owner1.setCity("Miami");
        owner1.setTelephone("123456789");

        //Pet
        Pet pet1 = new Pet();
        pet1.setPetType(saveDogType);
        pet1.setOwner(owner1);
        pet1.setName("Bob");
        pet1.setBirthDate(LocalDate.now());
        owner1.getPets().add(pet1);

        ownerService.save(owner1);

        //Owner
        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");
        owner2.setAddress("321 Unicord");
        owner2.setCity("Ohio");
        owner2.setTelephone("987654321");

        //Pet
        Pet pet2 = new Pet();
        pet2.setPetType(saveCatType);
        pet2.setOwner(owner2);
        pet2.setBirthDate(LocalDate.now());
        pet2.setName("Puss");
        owner2.getPets().add(pet2);

        ownerService.save(owner2);

        System.out.println("Loaded Owners....");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");

        vetService.save(vet2);

        System.out.println("Loaded Vets....");

        System.out.println("Strated in Bootstrap");
        System.out.println(ownerService.toString());
        System.out.println(vetService.toString());
        System.out.println(petTypeService.toString());


    }
}
