public class Dog extends Animal {
    private String breed;

    public Dog(String breed) {
        super("Dog");
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String makeSound() {
        return "Woof!";
    }

    @Override
    public String toString() {
        return "Dog{breed='" + breed + "', sound='" + makeSound() + "'}";
    }
}