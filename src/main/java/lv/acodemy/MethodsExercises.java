package lv.acodemy;

public class MethodsExercises {
    public static void main(String[] args) {

        System.out.println(Math.round(fahrenheitConverter(120)));
        System.out.println(fahrenheitConverter(120));

        System.out.println(currencyConverter("CZK", 50));
        System.out.println(currencyConverter("GBP", 120));


        System.out.println(isPalindrome("civic"));


        System.out.println(calculator("-", 20, 10));
    }


    public static double fahrenheitConverter(double fahrenheit) {
        return (fahrenheit - 32) / 1.80000;


    }

    // PLN // CZK // GBP
    public static double currencyConverter(String currency, double money) {
        double convertedAmount;
        switch (currency) {
            case "PLN":
                convertedAmount = money * 4.45;
                break;
            case "CZK":
                convertedAmount = money * 24.55;
                break;
            case "GBP":
                convertedAmount = money * 0.87;
                break;
            default:
                throw new RuntimeException("Unsupported currency: " + currency);

        }
        return convertedAmount;
    }

    public static boolean isPalindrome(String word) {
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }
        return reversed.equals(word);

    }

    public static double calculator(String operation, double firstNumber, double secondNumber) {
        double result = 0;
        switch (operation) {
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "/":
                result = firstNumber / secondNumber;
                break;
            default:
                throw new RuntimeException("Invalid operation: " + operation);
                if (operation.equals("+")) {
                    result = firstNumber + secondNumber;
                } else if (operation.equals("-")) {
                    result = firstNumber - secondNumber;
                } else if (operation.equals("*")) {
                    result = firstNumber * secondNumber;
                } else if (operation.equals("/")) {
                    result = firstNumber / secondNumber;
                } else {
                }
        }

    }
}

