package lv.acodemy;

public class SecondLessonExercises {
    public static void main(String[] args) {

//        int number = 10;
//        if(number % 2 == 0) {
//            System.out.println("This is even number!");
//        } else {
//            System.out.println("This is odd number!");
//        }

        int x = 10;
        int y = 12;
        int z = 14;

        if (x > y && x > z) {
            System.out.println("x this is the largest number!");
        } else if (y > x && y > z) {
            System.out.println("y this is the largest number");
        } else if (z > x && z > y) {
            System.out.println("z this the largest number");


            int num = 10;
            if (num == 0) {
                System.out.println("Number is Zero!");
            } else if (num < 0) {
                System.out.println("This number is negative!");
            } else {
                System.out.println("Positive number");
            }

            double weight = 70.4;
            double height = 174.0;

            double bmi = weight / (height * height);
            System.out.println(bmi);

            if (bmi < 18.5) {
                System.out.println("Underweight");
                System.out.println("Minimal health risk");
            } else if (bmi > 18.5 && bmi < 24.9) {
                System.out.println("Normal");
                System.out.println("Minimal health risk");
            } else if (bmi >= 25 && bmi <= 29.9) {
                System.out.println("Overweight");
                System.out.println();
            }

            int passwordCharacterCount = 8;
            if (passwordCharacterCount < 8) {
                System.out.println("Weak password!");
            } else if (passwordCharacterCount > 8 && passwordCharacterCount <= 11) {
            }

        }

    }
}