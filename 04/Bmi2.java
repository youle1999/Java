import java.util.Scanner;

class Bmi2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("���l�ł����F");
            int n = scanner.nextInt();
            if (n <= 0) break;

            for (int i = 0; i < n; i++) {
                //System.out.printf("%d�l��%n", i + 1);  
            	System.out.printf("%d�l��\n", i + 1);
                System.out.print("�g���� (cm)�F");
                double height = scanner.nextDouble();
                System.out.print("�̏d�� (kg)�F");
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
            System.out.println("�₹");
        } else if (bmi < 25) {
            System.out.println("�W��");
        } else if (bmi < 30) {
            System.out.println("�얞");
        } else {
            System.out.println("���x�얞");
        }
    }
}
