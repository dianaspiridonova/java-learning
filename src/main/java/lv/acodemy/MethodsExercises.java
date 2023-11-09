package lv.acodemy;

public class MethodsExercises {
    public static void main(String[] args) {

    }

    public static double fahrenheitConverter(double fahrenheit) {


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


        public static boolean isPalindrome (String word){
            String reversed = "";
            for (int i = word.length(); i > 0; i--) {
                reversed = reversed + word.charat(i);
            }
            if (reversed.equals(word)) {
                return true;

                
            }

            public static double calculator (String operation,double firstNumber, double secondNumber){
                double result = 0;
                switch (operation) {
                    case ""
                }
            }


        }


    }
}


