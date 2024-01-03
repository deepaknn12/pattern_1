
import java.util.Scanner;

public class interesting_alphabets {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        int j = 1;

        while (i <= n) {
            while (j <= i) {
                System.out.print((char) ('A' + n - i + j - 1));
                j++;
            }
            System.out.println();
            i++;
            j = 1;
            s.close();
        }
    }
}
