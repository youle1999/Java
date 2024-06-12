import java.util.Scanner;

public class Sosu2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.print("数をいれてください（-1で終了）：");
            int num = in.nextInt();
            
            if (num == -1) {
                System.out.println("END");
                break;
            }
            
            for (int i = 2; i <= num; i++) {
                boolean isPrime = true;
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.print(i + " ");
                }
            }
            System.out.println(); // Print a new line after listing all primes
        }
        in.close();
    }
}
