import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int value1 = in.nextInt();
        int value2 = in.nextInt();

        for (;value1 <= value2; value1++) {
            if ((value1 % 3 == 0) && (value1 % 5 == 0)) {
                System.out.println("FizzBuzz");
            }
            else if (value1 % 3 == 0) {
                System.out.println("Fizz");
            }
            else if (value1 % 5 == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(value1);
            }
        }
    }
}
