import java.util.List;

public class Main {
    public static void main(String[] args) {
        Shelter shelter = new Shelter("Happy Paws");

        // polymorphism: Animal reference, Dog/Cat objects
        Animal dog1 = new Dog("Labrador");
        Animal cat1 = new Cat(true);

        Pet p1 = new Pet(1, "Rocky", 3, dog1, true);
        Pet p2 = new Pet(2, "Mimi", 1, cat1, true);
        Pet p3 = new Pet(3, "Bobik", 5, new Dog("German Shepherd"), false);

        shelter.addPet(p1);
        shelter.addPet(p2);
        shelter.addPet(p3);

        Adopter a1 = new Adopter(101, "Aruzhan Bolatova", "+7 777 123 45 67");

        System.out.println(shelter);

        System.out.println("\n--- Available pets ---");
        List<Pet> available = shelter.filterAvailablePets();
        for (Pet pet : available) {
            System.out.println(pet);
        }

        System.out.println("\n--- Search pets by name 'mi' ---");
        for (Pet pet : shelter.searchPetsByName("mi")) {
            System.out.println(pet);
        }

        System.out.println("\n--- Filter by species 'Dog' ---");
        for (Pet pet : shelter.filterBySpecies("Dog")) {
            System.out.println(pet);
        }

        System.out.println("\n--- Sort by age ---");
        for (Pet pet : shelter.sortByAgeAscending()) {
            System.out.println(pet);
        }

        System.out.println("\n--- Adopt pet id=2 ---");
        boolean adopted = shelter.adoptPet(2, a1);
        System.out.println("Adopted? " + adopted);

        System.out.println("\n--- Available pets after adoption ---");
        for (Pet pet : shelter.filterAvailablePets()) {
            System.out.println(pet);
        }

        // equals/hashCode demo
        System.out.println("\n--- equals/hashCode demo ---");
        Pet sameIdPet = new Pet(1, "OtherName", 10, new Cat(false), true);
        System.out.println("p1 equals sameIdPet? " + p1.equals(sameIdPet));
        System.out.println("p1 hash=" + p1.hashCode() + ", sameIdPet hash=" + sameIdPet.hashCode());
    }
}
