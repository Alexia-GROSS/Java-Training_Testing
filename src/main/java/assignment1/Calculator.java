package assignment1;

public class Calculator {

    public static double multiply(double number1, double number2){
        return number1 * number2;
    }

    public static double divide(double number1, double number2){
        if (number2 == 0){
            throw new ArithmeticException("Divided by zero operation cannot possible");
        } else {
            return number1 / number2;
        }
    }

    public static double sum(double number1, double number2){
        return number1 + number2;
    }

    public static double substract(double number1, double number2){
        return number1 - number2;
    }
}
