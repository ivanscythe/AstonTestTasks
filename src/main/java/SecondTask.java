import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Первая строка a: ");
        String a = scanner.nextLine();

        System.out.println("Вторая строка b: ");
        String b = scanner.nextLine();

        if (a.equals(b)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }
    }
}
