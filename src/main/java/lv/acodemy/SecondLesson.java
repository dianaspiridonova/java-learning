package lv.acodemy;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLesson {
    public static void main(String[] args) {

        int[] numbers = {2, 3, 5, 8, 10, 11};
        int number = numbers[4];
        System.out.println(number);

        // determine size of array
        System.out.println(numbers.length);

        // change number in array
        numbers[5] = 1337;
        System.out.println(Arrays.toString(numbers));

        int[] emptyArray = new int[5];
        System.out.println(Arrays.toString(emptyArray));

        emptyArray[0] = 10;
        emptyArray[3] = 7;
        emptyArray[8] = 9;
        emptyArray[9] = 12;

        // String [] array
        String[] fruitBasket = {"apples", "banana", "kiwi", "pear", "pineapple"};

        String fruit = fruitBasket[3];
        System.out.println(fruit);
        System.out.println(fruitBasket[3]);

        if (10 > 5) {
            System.out.println("This statement is true!");

        }

        if (fruitBasket[0].equals("apples")) {
            System.out.println("Yes, you find apples");
        }

        // if-else (is, has)
        boolean isSummer = false;

        if (isSummer) {
            System.out.println("we will lay on a beach!");
        } else {
            System.out.println("We will watch Netflix series!");
        }

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter traffic light color:");
        String light = myScanner.next();
        if (light.equals("GREEN")) {
            System.out.println("You can go!");
        } else if (light.equals("YELLOW")) {
            System.out.println("Don't go, please wait for Green light!");
        } else if (light.equals("RED")) {
            System.out.println("Don't go!");
        } else {
            System.out.println("Traffic light is not working!");

        }


    }


}

