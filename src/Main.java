import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NullPointerException {

        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        String command;

        System.out.println("Введите число a");
        a = scanner.nextDouble();

        System.out.println("Введите число b");
        b = scanner.nextDouble();

        scanner.nextLine();

        System.out.println("Введите тип операции: [adder, divider, multiplier, subtractor]");
        command = scanner.nextLine();

        switch(command) {
            case "adder":
                Calculator calculator = new Calculator(new Adder());
                System.out.println(calculator.calc(a, b));
                break;
            case "divider":
                calculator = new Calculator(new Divider());
                System.out.println(calculator.calc(a, b));
                break;
            case "multiplier":
                calculator = new Calculator(new Multiplier());
                System.out.println(calculator.calc(a, b));
                break;
            case "subtractor":
                calculator = new Calculator(new Subtractor());
                System.out.println(calculator.calc(a, b));
                break;
        }
    }
}