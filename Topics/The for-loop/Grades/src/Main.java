import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // get number of grades
        int count = in.nextInt();

        // build character table with length of grades
        char[] table = new char[count];

        // initialize possible grades for counting
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;

        // scan table over and over counting matching grades each time
        for (int i = 0; i < table.length; i++) {
            table[i] =  in.next().charAt(0);
        }

        for (int x = 0; x < table.length; x++) {
            if (table[x] == 'A') {
                a++;
            }
        }

        for (int x = 0; x < table.length; x++) {
            if (table[x] == 'B') {
                b++;
            }
        }

        for (int x = 0; x < table.length; x++) {
            if (table[x] == 'C') {
                c++;
            }
        }

        for (int x = 0; x < table.length; x++) {
            if (table[x] == 'D') {
                d++;
            }
        }

        // print final count of grades in reverse order
        System.out.printf("%d %d %d %d", d, c, b, a);

    }
}