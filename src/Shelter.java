import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Shelter {
    private String name;
    private final List<Pet> pets;         // data pool
    private final List<Adopter> adopters; // data pool

    public Shelter(String name) {
        this.name = name;
        this.pets = new ArrayList<>();
        this.adopters = new ArrayList<>();
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public void addPet(Pet pet) {
        pets.add(pet);
    }

    public void addAdopter(Adopter adopter) {
        adopters.add(adopter);
    }


    public Pet findPetById(int id) {
        for (Pet pet : pets) {
            if (pet.getId() == id) return pet;
        }
        return null;
    }

    public List<Pet> searchPetsByName(String keyword) {
        List<Pet> result = new ArrayList<>();
        for (Pet pet : pets) {
            if (pet.getName().toLowerCase().contains(keyword.toLowerCase())) {
                result.add(pet);
            }
        }
        return result;
    }


    public List<Pet> filterAvailablePets() {
        List<Pet> result = new ArrayList<>();
        for (Pet pet : pets) {
            if (pet.isAvailable()) result.add(pet);
        }
        return result;
    }

    public List<Pet> filterBySpecies(String species) {
        List<Pet> result = new ArrayList<>();
        for (Pet pet : pets) {
            if (pet.getAnimal().getSpecies().equalsIgnoreCase(species)) {
                result.add(pet);
            }
        }
        return result;
    }
    public List<Pet> sortByAgeAscending() {
        List<Pet> copy = new ArrayList<>(pets);
        copy.sort(Comparator.comparingInt(Pet::getAge));
        return copy;
    }

    public List<Pet> sortByNameAscending() {
        List<Pet> copy = new ArrayList<>(pets);
        copy.sort(Comparator.comparing(Pet::getName));
        return copy;
    }


    public boolean adoptPet(int petId, Adopter adopter) {
        Pet pet = findPetById(petId);
        if (pet == null) return false;
        if (!pet.isAvailable()) return false;

        pet.setAvailable(false);
        if (!adopters.contains(adopter)) {
            adopters.add(adopter);
        }
        return true;
    }

    @Override
    public String toString() {
        return "Shelter{" +
                "name='" + name + '\'' +
                ", petsCount=" + pets.size() +
                ", adoptersCount=" + adopters.size() +
                '}';
    }
}
