class StudentCard {
    int id; // �w�Дԍ�
    String name; // ����
}


public class Example5_01 {
    public static void main(String[] args) {
    StudentCard a = new StudentCard();
    a.id = 1234;
    a.name = "��ؑ��Y";
    StudentCard b = new StudentCard();
    b.id = 1235;
    b.name = "�����Ԏq";
    System.out.println("a��id��" + a.id);
    System.out.println("a��name��" + a.name);
    System.out.println("b��id��" + b.id);
    System.out.println("b��name��" + b.name);
    }
}
