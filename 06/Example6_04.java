class SimpleCalc {
    // 引数で渡された底辺と高さの値から三角形の面積を返す
    static double getTriangleArea(double base, double height) {
        return base * height / 2.0;
    }
}
public class Example6_04 {
    public static void main(String[] args) {
        System.out.println("底辺が10、高さが5の三角形の面積は"
        + SimpleCalc.getTriangleArea(10, 5) + "です");
    }
}

