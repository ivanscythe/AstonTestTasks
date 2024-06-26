import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Число a: ");
        int a = scanner.nextInt();
        System.out.print("Число b: ");
        int b = scanner.nextInt();

        if (a>b) {
            System.out.println("a>b");
        } else if (a<b) {
            System.out.println("a<b");
        } else {
            System.out.println("a=b");
        }

        int sum = a+b;
        int diff = a-b;
        float div = (float) a /b;
        int mult = a*b;

        System.out.println("Сложение= " + sum);
        System.out.println("Вычитание= " + diff);
        System.out.println("Деление= " + div);
        System.out.println("Умножение= " + mult);
    }
}
