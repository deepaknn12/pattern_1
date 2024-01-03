import java.util.Scanner;
public class reverse_char_pattern {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            int i = 1;
            while (i <= n) {
                int j = 1;
                char ans = (char) ('A' + n - 1);
                while (j <= i) {
                    System.out.print(ans);
                    ans--;
                    j++;
                }
                System.out.println();
                i++;
                s.close();
            }
        }
    }
    

