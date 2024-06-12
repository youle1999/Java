import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("���a�́F");
            double radius = scanner.nextDouble();

            if (!isPositiveNumber(radius)) {
                break;
            }

            double area = getAreaOfCircle(radius);
            System.out.printf("���a %.1f �� �ʐς� %.3f �ł�%n", radius, area);
        }

        scanner.close();
    }

    public static double getAreaOfCircle(double radius) {
        return Math.PI * radius * radius;
    }

    public static boolean isPositiveNumber(int i) {
        return i > 0;
    }

    public static boolean isPositiveNumber(double d) {
        return d > 0.0;
    }
}
