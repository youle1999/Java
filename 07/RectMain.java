import java.util.Scanner;

public class RectMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("��: ");
        int w = in.nextInt();
        
        System.out.print("����: ");
        int h = in.nextInt();
        
        System.out.print("���s��: ");
        int d = in.nextInt();
        
        Cube c = new Cube(w, h, d);
        
        System.out.println("�ʐ�: " + c.getArea());
        System.out.println("�̐�: " + c.getVolume());
    }
}
