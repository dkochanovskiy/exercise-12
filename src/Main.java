import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NullPointerException {

        Scanner scanner = new Scanner(System.in);

        double a;
        double b;

        System.out.println("Введите число a");
        a = scanner.nextDouble();

        System.out.println("Введите число b");
        b = scanner.nextDouble();

        Calculator calculator = new Calculator((double n, double m) -> n + m);
        System.out.println("Результат сложения a и b: " + calculator.calc(a, b));

        calculator = new Calculator((double n, double m) -> n - m);
        System.out.println("Результат вычитания a и b: " + calculator.calc(a, b));

        calculator = new Calculator(new Multiplier());
        System.out.println("Результат умножения a и b: " + calculator.calc(a, b));

        calculator = new Calculator(new Divider());
        System.out.println("Результат деления a и b: " + calculator.calc(a, b));
    }
}