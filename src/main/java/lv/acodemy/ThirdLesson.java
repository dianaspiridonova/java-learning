package lv.acodemy;

public class ThirdLesson {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World!");
        }

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }

        String[] arrayOfNames = {"Nikita", "John", "Mike", "Anthony", "Mary", "Ann"};


        for (int i = 0; i < arrayOfNames.length; i++) {
            System.out.println(arrayOfNames[i]);
        }

        // for each (will print all elements)
        for (String name : arrayOfNames) {
            System.out.println(name);

        }

        String[] countries = {
                "United States",
                "Canada",
                "United Kingdom",
                "Germany",
                "France",
                "Australia",
                "Japan",
                "India",
                "China",
                "Brazil"
        };

        for (int i = 0; i < countries.length; i++) {
            if (countries[i].equals("Japan")) {
                System.out.println("JAMETE KUDASAI!");
                break;
            }

            int[] firstArray = {1, 2, 3, 4, 5};
            int[] secondArray = {3, 4, 5, 6, 7};
            int[] thirdArray = {5, 6, 7, 8, 9};

            for (int numberOfFirstArray : firstArray) {
                for (int numberOfSecondArray : secondArray) {
                    for (int numberOfThirdArray : thirdArray) {
                        if (numberOfFirstArray == numberOfSecondArray && numberOfSecondArray == numberOfThirdArray) {
                            System.out.println(numberOfFirstArray);
                        }
                    }
                }
            }


        }
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " ");
            }

            int x = 1;
            int summa = 0;
            while (x <= 5) {
                summa = summa + x;
                x++;
            }
            System.out.println("Summa" + summa);


            //Print even numbers from 0 to 20
            int y = 0;
            while (y <= 20) {
                System.out.println(y + " ");
                y = y + 2;
            }

            int z = 1;
            do {
                System.out.println(z);
                z++;
            } while (z <= 5);


        }
    }
}
