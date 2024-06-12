import java.util.Scanner;

class Bmi2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("何人ですか：");
            int n = scanner.nextInt();
            if (n <= 0) break;

            for (int i = 0; i < n; i++) {
                //System.out.printf("%d人目%n", i + 1);  
            	System.out.printf("%d人目\n", i + 1);
                System.out.print("身長は (cm)：");
                double height = scanner.nextDouble();
                System.out.print("体重は (kg)：");
                double weight = scanner.nextDouble();

                double bmi = calcBmi(height, weight);
                System.out.printf("bmi=%.6f%n", bmi);  
                judgeBmi(bmi);
            }

            System.out.println("END");
        }

        scanner.close();
    }

    
    public static double calcBmi(double height, double weight) {
        height = height / 100; // Convert height from cm to meters
        return weight / (height * height);
    }

    
    public static void judgeBmi(double bmi) {
        if (bmi < 18.5) {
            System.out.println("やせ");
        } else if (bmi < 25) {
            System.out.println("標準");
        } else if (bmi < 30) {
            System.out.println("肥満");
        } else {
            System.out.println("高度肥満");
        }
    }
}
