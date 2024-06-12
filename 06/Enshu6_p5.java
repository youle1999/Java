import java.util.Scanner;

class Rectangle {
    double width; // ��
    double height; // ����
	// �ȉ��ɃR���X�g���N�^�A���\�b�h���L�q����

   
    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    
    double getArea() {
        return width * height;
    }

    
    boolean isLarger(Rectangle other) {
        return this.getArea() > other.getArea();
    }
}

public class Enshu6_p5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Rectangle r1 = new Rectangle(15, 20);
        System.out.println("r1�̖ʐ�=" + r1.getArea());

        System.out.print("���́F");
        double w2 = in.nextDouble();
        System.out.print("�����́F");
        double h2 = in.nextDouble();
        
        Rectangle r2 = new Rectangle(w2, h2);
        System.out.println("r2�̖ʐ�=" + r2.getArea());

        if (r1.isLarger(r2)) {
            System.out.println("r1�̕����ʐς��傫��");
        } else {
            System.out.println("r1�̕����ʐς���������������");
        }
    }
}
