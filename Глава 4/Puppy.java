import java.util.Scanner;
class Puppy extends Dog {
    public Puppy(String name) {
        super(name);
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Щенок играет с кем: ");
        String withWhom = scanner.nextLine();
        System.out.println("Щенок играет с " + withWhom);
    }

    @Override
    public String toString() {
        return "Puppy { Имя ='" + name + "' }";
    }
}
