import java.util.Objects;

public class Adopter extends Person {
    private String phone;

    public Adopter(int id, String fullName, String phone) {
        super(id, fullName);
        this.phone = phone;
    }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    @Override
    public String getRole() {
        return "Adopter";
    }

    @Override
    public String toString() {
        return "Adopter{" +
                "id=" + getId() +
                ", fullName='" + getFullName() + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Adopter)) return false;
        Adopter adopter = (Adopter) o;
        return getId() == adopter.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
