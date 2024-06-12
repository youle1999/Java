import java.util.Scanner;

class Rectangle {
    double width; // 幅
    double height; // 高さ
	// 以下にコンストラクタ、メソッドを記述する

   
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
        System.out.println("r1の面積=" + r1.getArea());

        System.out.print("幅は：");
        double w2 = in.nextDouble();
        System.out.print("高さは：");
        double h2 = in.nextDouble();
        
        Rectangle r2 = new Rectangle(w2, h2);
        System.out.println("r2の面積=" + r2.getArea());

        if (r1.isLarger(r2)) {
            System.out.println("r1の方が面積が大きい");
        } else {
            System.out.println("r1の方が面積が小さいか等しい");
        }
    }
}
