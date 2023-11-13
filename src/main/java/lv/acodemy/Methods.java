package lv.acodemy;

public class Methods {
    public static void main(String[] args) {
        String acodemy = "Acodemy";
        printSomeText(10, acodemy);


        System.out.println(calculateSumOfTwoNumbers(20, 40));
        int sumOfTwoNumbers = calculateSumOfTwoNumbers(10, 20);
        System.out.println(sumOfTwoNumbers);
    }

    public static void printSomeText(int loopCount, String text) {
        for (int i = 0; i < loopCount; i++) {
            System.out.println(text);
        }


    }


    public static int calculateSumOfTwoNumbers(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public static void printInfo(String name, String lastName, int age) {
        System.out.printf("My name is %s. My surname is %s. I am %d years old.\n",
                name, lastName, age);
        printInfo("Diana", "Spiridonova", 24);

    }

}







