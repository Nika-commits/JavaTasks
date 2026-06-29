import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the First number: ");
        int number1 = scanner.nextInt();

        System.out.println("Enter the First number: ");
        int number2 = scanner.nextInt();

        System.out.println("Enter the type of Calculation you want to perform ? (Add, Subtract, Multiply, Divide");

        String typeOfCalc = scanner.next().toLowerCase();

        switch (typeOfCalc){
            case "add" -> System.out.println(Calculator.Add(number1, number2));
            case "subtract" -> System.out.println(Calculator.Substract(number1 , number2));
            case "multiply" -> System.out.println(Calculator.Multiply(number1, number2));
            case "divide" -> System.out.println(Calculator.Divide(number1 , number2));
        }

    }
}

