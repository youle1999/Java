import java.util.Scanner;

public class RectMain2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("��: ");
        int w = in.nextInt();
        
        System.out.print("����: ");
        int h = in.nextInt();
        
        System.out.print("�[��: ");
        int d = in.nextInt();
        
        Cube2 c = new Cube2(w, h, d);
        
        System.out.println("�ʐ�: " + c.getArea());
        System.out.println("�̐�: " + c.getVolume());
    }
}
