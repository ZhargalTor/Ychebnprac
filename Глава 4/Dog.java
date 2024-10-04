import java.util.*;

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Собака лает");
    }

    public void bite() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите кого кусает собака: ");
        String whom = scanner.nextLine();
        System.out.println("Собака кусает " + whom);
    }

    @Override
    public String toString() {
        return "Dog { Имя = '" + name + "' }";
    }
}
