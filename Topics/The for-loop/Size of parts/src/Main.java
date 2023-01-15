import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int larger = 0;

        int smaller = 0;

        int perfect = 0;

        int parts = in.nextInt();

        for (int i = 0; i < parts; i++) {
            int ingest = in.nextInt();
            larger = (ingest == 1) ? larger += 1 : larger;
            smaller = (ingest == -1) ? smaller += 1 : smaller;
            perfect = (ingest == 0) ? perfect += 1 : perfect;
        }
       System.out.printf("%s %s %s", perfect, larger, smaller);

    }
}
