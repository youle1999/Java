class SimpleCalc {
    // �����œn���ꂽ��ӂƍ����̒l����O�p�`�̖ʐς�Ԃ�
    static double getTriangleArea(double base, double height) {
        return base * height / 2.0;
    }
}
public class Example6_04 {
    public static void main(String[] args) {
        System.out.println("��ӂ�10�A������5�̎O�p�`�̖ʐς�"
        + SimpleCalc.getTriangleArea(10, 5) + "�ł�");
    }
}

