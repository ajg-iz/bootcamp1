import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String name;
        Integer age;
        String favourite_saying;
        Double number1;
        Double number2;
        String operator;
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Name: ");
            name = scanner.nextLine();

            System.out.print("Age: ");
            age = scanner.nextInt();
            scanner.nextLine();
            

            System.out.print("Your favourite saying: ");
            favourite_saying = scanner.nextLine();
            

            System.out.print("First number: ");
            number1 = scanner.nextDouble();
            scanner.nextLine();
            

            System.out.print("Second number: ");
            number2 = scanner.nextDouble();
            scanner.nextLine();
            

            System.out.print("Operator:");
            operator = scanner.nextLine();
            

            System.out.println("Hello " + name + ". You are "+age+" years old.\n Your favourite saying is \"" + favourite_saying + "\".");
            System.out.println("You asked to solve " + number1 +""+ operator +""+ number2 + ".");
            System.out.println("The result of that operation is: " + performOperation(number1, number2, operator));
        } catch (Exception e) {
            System.out.printf(e.getMessage());
        }

    }
    public static double performOperation(double number1, double number2, String operator) {
        switch (operator) {
            case "+":
                return number1 + number2;
            case "-":
                return number1 - number2;
            case "*":
                return number1 * number2;
            case "/":
                if (number2 == 0) {
                    throw new IllegalArgumentException("Cannot divide by zero.");
                }
                return number1 / number2;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
}