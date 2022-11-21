public class Main {
    public static void main(String[] args) {
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        sum();

        divide();

        square();
    }

    // classes 1_2
    public static void sum() {
        int myInt = 666;
        System.out.println("int = " + myInt);
        final char[] array = Integer.toString(myInt).toCharArray();

        int sum = 0;
        for (final char c : array) {
            if (!Character.isDigit(c)) {
                throw new IllegalArgumentException();
            }

            sum = sum + Character.getNumericValue(c);
        }

        System.out.println("sum = " + sum);
    }

    //classes 1_3
    public static void divide() {
        int x = 382;
        int y = 38;
        int b = x % y;
        System.out.println(b);
    }

    //classes 1_4
    public static void square() {
        int a = 4;
        int b = 2;
        int S = a * b;
        System.out.println(S);
    }
}


