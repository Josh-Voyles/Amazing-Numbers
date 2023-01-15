import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = 1; // starting number to increment
        
        int num2 = in.nextInt(); // get number from user

        int total = 0; // sum of squares

        while (num2 > total) {
            total = (num1 * num1);
            if (total <= num2){
                System.out.println(total);    
            }
            ++num1;
        }
    }
}
