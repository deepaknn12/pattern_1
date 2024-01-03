import java.util.Scanner;
public class character_pattern {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

       
        int n = scanner.nextInt();
        
        char currentChar = 'A';
        int row = 1;

        while (row <= n) {
            int col = 1;
            char currentPrintChar = currentChar;

            while (col <= row) {
                System.out.print(currentPrintChar);
                currentPrintChar++;
                col++;
            }

            System.out.println();
            currentChar++;
            row++;
        }

        scanner.close();
    }
}