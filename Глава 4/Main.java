Глава 4 Вариант A задание 10
Выполнил: Торяшиев Жаргал

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя щенка: ");
        String name = scanner.nextLine();
        Puppy puppy = new Puppy(name);
        puppy.makeSound();
        puppy.jump();
        puppy.run();
        puppy.bite();
        puppy.play();
        System.out.println("Имя щенка: " + puppy.name);
    }
}
