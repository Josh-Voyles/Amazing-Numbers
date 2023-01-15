import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // m is user input
        long m = in.nextLong();

        // n is the number we compare against (1 since we are multiplying)
        long n = 1;

        // starting at 20 because 20! is huge
        // we compare i! and subtract 1 for every iteration
        for (int i = 20; i > 0; i--) {
            for (int j = i; j > 1;) {
                n *= --j;
            }
            // if we hit our goal, we print
            if (n <= m) {
                System.out.println(i);
                break;
              // otherwise, we start n back at 1 and try again
            } else {
                n = 1;
            }
        }
    }
}