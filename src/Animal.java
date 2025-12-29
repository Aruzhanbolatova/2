public abstract class Animal {
    private String species;

    public Animal(String species) {
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
    public abstract String makeSound();

    @Override
    public String toString() {
        return "Animal{species='" + species + "'}";
    }
}
