public abstract class Person {
    private final int id;
    private String fullName;

    public Person(int id, String fullName) {
        this.id = id;
        this.fullName = fullName;
    }

    public int getId() { return id; }

    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }

    public abstract String getRole();

    @Override
    public String toString() {
        return getRole() + "{id=" + id + ", fullName='" + fullName + "'}";
    }
}
