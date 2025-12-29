public class Cat extends Animal {
    private boolean likesPeople;

    public Cat(boolean likesPeople) {
        super("Cat");
        this.likesPeople = likesPeople;
    }

    public boolean isLikesPeople() {
        return likesPeople;
    }

    public void setLikesPeople(boolean likesPeople) {
        this.likesPeople = likesPeople;
    }

    @Override
    public String makeSound() {
        return "Meow!";
    }

    @Override
    public String toString() {
        return "Cat{likesPeople=" + likesPeople + ", sound='" + makeSound() + "'}";
    }
}
