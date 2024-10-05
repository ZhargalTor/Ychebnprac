import java.util.Objects;

class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println("Животное издает звук");
    }

    public void jump() {
        System.out.println("Животное прыгает");
    }

    public void run() {
        System.out.println("Животное бежит");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Animal { Имя = '" + name + "' }";
    }
}
