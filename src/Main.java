import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        sum();

        divide();

        square(1, 2);
    }

    // classes 1_2
    public static void sum() {
        System.out.println("Введите трехзначное натуральное число:");
        Scanner in = new Scanner(System.in);
        String myInt = in.nextLine();

        System.out.println("int = " + myInt);
        final char[] array = myInt.toCharArray();

        int sum = 0;
        for (final char c : array) {
            if (!Character.isDigit(c)) {
                throw new IllegalArgumentException();
            }

            sum = sum + Character.getNumericValue(c);
        }

        System.out.println("Сумма трех натуральных чисел = " + sum);

    }

    //classes 1_3
    public static void divide() {
        int x = 382;
        int y = 38;
        System.out.println("Остаток от деления " + x + "/" + y);
        int b = x % y;
        System.out.println(b);
    }

    //classes 1_4
    public static void square(int a, int b) {
        System.out.println("Ищем S у прямоугольника " + a + "*" + b);
        System.out.println(a * b);
    }
}


