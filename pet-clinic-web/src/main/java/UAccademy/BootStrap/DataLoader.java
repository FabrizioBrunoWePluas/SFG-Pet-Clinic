package UAccademy.BootStrap;

import UAccademy.Model.*;
import UAccademy.Service.OwnerService;
import UAccademy.Service.PetTypeService;
import UAccademy.Service.SpecialityService;
import UAccademy.Service.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    private final SpecialityService specialityService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialityService specialityService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialityService = specialityService;
    }

    @Override
    public void run(String... args) throws Exception {

        int count = petTypeService.findAll().size();

        if(count == 0){
            loadData();
        }

        System.out.println(count);


    }

    private void loadData() {
        PetType dog = new PetType();
        dog.setName("Dog");
        PetType saveDogType = petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("Cat");
        PetType saveCatType = petTypeService.save(cat);

        Speciality radiology = new Speciality();
        radiology.setDescription("Radiology");
        Speciality savedRadiology = specialityService.save(radiology);

        Speciality surgery = new Speciality();
        surgery.setDescription("Surgery");
        Speciality savedSurgery = specialityService.save(surgery);

        Speciality dentistry = new Speciality();
        dentistry.setDescription("Dentistry");
        Speciality savedDentistry = specialityService.save(dentistry);

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

        //Vet
        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");
        vet1.getSpecialities().add(savedRadiology);

        vetService.save(vet1);

        //Vet
        Vet vet2 = new Vet();
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");
        vet2.getSpecialities().add(savedSurgery);

        vetService.save(vet2);

        System.out.println("Loaded Vets....");

        System.out.println("Strated in Bootstrap");
        System.out.println(ownerService.toString());
        System.out.println(vetService.toString());
        System.out.println(petTypeService.toString());
        System.out.println(specialityService.toString());

    }
}
