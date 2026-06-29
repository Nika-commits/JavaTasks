import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the First number: ");
        int number1 = scanner.nextInt();

        System.out.println("Enter the First number: ");
        int number2 = scanner.nextInt();

        System.out.println("Enter the type of Calculation you want to perform ? (Add, Subtract, Multiply, Divide");

        String typeOfCalc = scanner.next().toUpperCase();
        Calculations calculations = Calculations.valueOf(typeOfCalc);
        switch (calculations){
            case ADD -> System.out.println(Calculator.Add(number1, number2));
            case SUBTRACT -> System.out.println(Calculator.Substract(number1 , number2));
            case MULTIPLY -> System.out.println(Calculator.Multiply(number1, number2));
            case DIVIDE -> System.out.println(Calculator.Divide(number1 , number2));
        }

    }
}

