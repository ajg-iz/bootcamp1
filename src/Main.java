
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String name;
        Integer age;
        String favourite_saying;
        Double number1;
        Double number2;
        Boolean isNumber;
        String operator;
        char[] validOperators;
        Boolean isValidOperator;
        Scanner scanner = new Scanner(System.in);

        try {
            name="";
            while (name.trim().isEmpty()) {
                System.out.print("Name: ");
                name = scanner.nextLine();
                if (name.trim().isEmpty()) {
                    System.out.println("Invalid name.");
                }
            }

            age=0;
            isNumber=false;
            while (!isNumber) {
                System.out.print("Your age: ");
                try {
                    age = scanner.nextInt();
                    isNumber=true;
                } catch(Exception e) {
                    System.out.println("Invalid number.");
                }
                scanner.nextLine();
            }


            favourite_saying = "";
            while (favourite_saying.trim().isEmpty()) {
                System.out.print("Your favourite saying: ");
                favourite_saying = scanner.nextLine();
                if(favourite_saying.trim().isEmpty()){
                    System.out.println("Invalid favourite saying.");
                }
            }

            number1=0.0;
            isNumber=false;
            while (!isNumber) {
                System.out.print("First number: ");
                try {
                    number1 = scanner.nextDouble();
                    isNumber=true;
                } catch(Exception e) {
                    System.out.println("Invalid number.");
                }
                scanner.nextLine();
            }


            number2=0.0;
            isNumber=false;
            while (!isNumber) {
                System.out.print("Second number: ");
                try {
                    number2 = scanner.nextDouble();
                    isNumber=true;
                } catch(Exception e) {
                    System.out.println("Invalid number.");
                }
                scanner.nextLine();
            }

            operator = "";
            validOperators = new char[5];
            validOperators[0] = '+';
            validOperators[1] = '-';
            validOperators[2] = '*';
            validOperators[3] = '/';
            validOperators[4] = '%';
            isValidOperator = false;

            while (operator.trim().isEmpty() || !isValidOperator) {
                System.out.print("Operator:");
                operator = scanner.nextLine();
                if (!operator.trim().isEmpty()) {
                    for (int i = 0; i < validOperators.length; i++) {
                        if (operator.trim().charAt(0) == validOperators[i]) {
                            isValidOperator = true;
                            break;
                        }
                    }
                    if (!isValidOperator) {
                        System.out.println("Invalid operator.");
                    }
                }
            }
            

            System.out.println("Hello " + name + ". You are "+age+" years old.\nYour favourite saying is \"" + favourite_saying + "\".");
            System.out.println("You asked to solve " + number1 + operator + number2 + ".");
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
            case "%":
                if (number2 == 0) {
                    throw new IllegalArgumentException("Cannot divide by zero.");
                }
                return number1 % number2;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
}