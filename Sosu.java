import java.util.Scanner;

public class Sosu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("”‚ğ‚¢‚ê‚Ä‚­‚¾‚³‚¢F");
        int num = in.nextInt();
        
        for (int i = 2; i <= num; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
        }
        System.out.println("END");
    }
}
