class StudentCard {
    // �K�v�ȃt�B�[���h�𖄂߂悤
     int id; // �w�Дԍ�
    String name; // ����
}


public class Example5_03 {
    public static void main(String[] args) {
        StudentCard a = new StudentCard();
        StudentCard b = new StudentCard();
        StudentCard c = b;
        a.id = 1234;
        a.name = "��ؑ��Y";
        b.id = 1235;
        b.name = "�����Ԏq";


        System.out.println(a.id);
        System.out.println(a.name);
        System.out.println();


        System.out.println(b.id);
        System.out.println(b.name);
        System.out.println();


        System.out.println(c.id);
        System.out.println(c.name);
    }
}

