import java.util.Scanner;

public class Renshu4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;
        
        while (true) {
            System.out.print("何歳ですか：");
            age = scanner.nextInt();
            
            if (age >= 0 && age <= 150) {  // Assuming age range is 0 to 150
                if (age >= 20) {
                    System.out.println("大人です");
                } else {
                    System.out.println("子供です");
                }
            } else {
                break;
            }
        }
        
        scanner.close();
    }
}
