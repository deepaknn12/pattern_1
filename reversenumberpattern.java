import java.util.Scanner;

public class reversenumberpattern {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        while (i <= n) {
            int j = i;
            while (j > 0) {
                System.out.print(j);
                j--;
            }
            System.out.println();
            i++;
            s.close();
        }
    }
}
