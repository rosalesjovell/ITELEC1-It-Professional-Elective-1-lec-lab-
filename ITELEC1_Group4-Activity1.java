import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2, total;
        char operator;
        
        System.out.println(" + = ADDITION");
        System.out.println(" - = SUBTRACTION");
        System.out.println(" * = MULTIPLICATION");
        System.out.println(" / = DIVISION");
        
        System.out.print("Enter your first number: ");
        num1 = input.nextDouble();
        System.out.print("Enter your operator ( +, -, *, /): ");
        operator = input.next().charAt(0);
        System.out.print("Enter your second number: ");
        num2 = input.nextDouble();
        
        if (operator == '+') {
            total = num1 + num2;
            System.out.print(num1 + " + " + num2 + " = " + total);
        }
        else if (operator == '-') {
            total = num1 - num2;
            System.out.print(num1 + " - " + num2 + " = " + total);
        }
        else if (operator == '*') {
            total = num1 * num2;
            System.out.print(num1 + " * " + num2 + " = " + total);
        }
        else if (operator == '/') {
            if (num2 != 0) {
                total = num1 / num2;
                System.out.print(num1 + " / " + num2 + " = " + total);
            }
            else {
                System.out.print("Cannot Divide by Zero");
            }
        }
        else {
            System.out.print("Invalid Operator");
        }
    }
}