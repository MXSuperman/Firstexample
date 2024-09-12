package MXN;

public class Main {

    public static void main(String[] args) {

        // Задание 6
        int a = 12;
        int b = 27;
        int c = 44;
        int d = 15;
        int e = 9;
        int result = (a * (b + (c - d * e)));
        {
            System.out.println(result);
        }
        // Задание 7

        byte x = 7;
        byte y = 5;
        System.out.println("y = " + (y + x - y));
        System.out.println("x = " + ((x + y) - x));

        // Задание 8

        int number = 326;
        int number2 = 2;
        int m = number / 10;
        int n = m / number + number2;
        System.out.println(n);
        }
    }

