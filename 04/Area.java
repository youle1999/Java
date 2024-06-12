import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("”¼Œa‚ÍF");
            double radius = scanner.nextDouble();

            if (!isPositiveNumber(radius)) {
                break;
            }

            double area = getAreaOfCircle(radius);
            System.out.printf("”¼Œa %.1f ‚Ì –ÊÏ‚Í %.3f ‚Å‚·%n", radius, area);
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
