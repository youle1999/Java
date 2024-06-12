import java.util.Scanner;

public class Renshu4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;
        
        while (true) {
            System.out.print("‰½Î‚Å‚·‚©F");
            age = scanner.nextInt();
            
            if (age >= 0 && age <= 150) {  // Assuming age range is 0 to 150
                if (age >= 20) {
                    System.out.println("‘ål‚Å‚·");
                } else {
                    System.out.println("q‹Ÿ‚Å‚·");
                }
            } else {
                break;
            }
        }
        
        scanner.close();
    }
}
