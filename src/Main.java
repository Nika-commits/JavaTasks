import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean toContinue = false;

        do {
            try {
                System.out.println("Enter the First number: ");
                int number1 = scanner.nextInt();

                System.out.println("Enter the Second number: ");
                int number2 = scanner.nextInt();

                System.out.println("Enter the type of Calculation you want to perform ? (Add, Subtract, Multiply, Divide)");

                String typeOfCalc = scanner.next().toUpperCase();
                Calculations calculations = Calculations.valueOf(typeOfCalc);

                switch (calculations) {
                    case ADD ->
                            System.out.println("Addition: " + Calculator.Add(number1, number2));
                    case SUBTRACT ->
                            System.out.println("Subtraction: " + Calculator.Subtract(number1, number2));
                    case MULTIPLY ->
                            System.out.println("Multiplication: " + Calculator.Multiply(number1, number2));
                    case DIVIDE ->
                            System.out.println("Division: " + Calculator.Divide(number1, number2));
                }
             } catch (
                            java.util.InputMismatchException ex) {
                System.out.println("Please input numbers");
                    } catch     (
                    IllegalArgumentException ex) {
                System.out.println("Invalid Calculation Type. ");
            } catch (
                    ArithmeticException ex) {
                System.out.println("Cannot perform calculation");
            }

            System.out.println("Do you want to calculate again ? (Y)\nPress any other to exit");

            String answer = scanner.next().toLowerCase();

            toContinue = answer.equals("y");

        } while (toContinue);
    }
}

