import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int hr1 = in.nextInt() * 60 * 60;
        int min1 = in.nextInt() * 60;
        int sec1 = in.nextInt();
        int hr2 = in.nextInt()  * 60 * 60;
        int min2 = in.nextInt() * 60;
        int sec2 = in.nextInt();


        int add1 = hr1 + min1 + sec1;
        int add2 = hr2 + min2 + sec2;

        System.out.println(Math.abs(add1 - add2));
    }


}