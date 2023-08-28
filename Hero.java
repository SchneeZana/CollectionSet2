import java.util.Objects;
        public class Hero implements Comparable<Hero> {

    // Attributes
    private String name;
    private int age;

    // Constructors
    public Hero(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Accessors (getters)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Mutators (setters)
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Hero other) {
        return Integer.compare(this.age, other.age);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hero hero = (Hero) o;
        return age == hero.age &&
                Objects.equals(name, hero.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
