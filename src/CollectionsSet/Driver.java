package CollectionsSet;

import java.util.Objects;

public class Driver {
    public enum Category {
        B,
        C,
        D;
    }
    public enum TypeTransp {
        CAR,
        TRUCK,
        BUS;
    }

    private final String fio;
    private Category category;
    private TypeTransp typeTransp;

    public Driver(String fio, Category category, TypeTransp typeTransp) {
        this.fio = fio;
        this.category = category;
        this.typeTransp = typeTransp;
    }

    public String getFio() {
        return fio;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public TypeTransp getTypeTransp() {
        return typeTransp;
    }

    public void setTypeTransp(TypeTransp typeTransp) {
        this.typeTransp = typeTransp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return Objects.equals(fio, driver.fio) && category == driver.category && typeTransp == driver.typeTransp;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fio, category, typeTransp);
    }

    @Override
    public String toString() {
        return "Driver{" +
                "fio='" + fio + '\'' +
                ", category=" + category +
                ", typeTransp=" + typeTransp +
                '}';
    }
}
