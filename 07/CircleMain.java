import java.util.Scanner;

public class CircleMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("���a: ");
        double r = in.nextDouble();
        
        System.out.print("����: ");
        double h = in.nextDouble();
        
        Circle cir = new Circle(r);
        Cylinder cyl = new Cylinder(r, h);
        
        System.out.println("�~�̖ʐ�: " + cir.getArea());
        System.out.println("�~���̕\�ʐ�: " + cyl.getSurfaceArea());
        System.out.println("�~���̑̐�: " + cyl.getVolume());
    }
}
