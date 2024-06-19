import java.util.Scanner;

public class CircleMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("”¼Œa: ");
        double r = in.nextDouble();
        
        System.out.print("‚‚³: ");
        double h = in.nextDouble();
        
        Circle cir = new Circle(r);
        Cylinder cyl = new Cylinder(r, h);
        
        System.out.println("‰~‚Ì–ÊÏ: " + cir.getArea());
        System.out.println("‰~’Œ‚Ì•\–ÊÏ: " + cyl.getSurfaceArea());
        System.out.println("‰~’Œ‚Ì‘ÌÏ: " + cyl.getVolume());
    }
}
