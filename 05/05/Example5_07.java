class StudentCard {
    int id;
    String name;
}


public class Example5_07 {
    public static void main(String[] args) {


        StudentCard a = new StudentCard();


        a.id = 1234;
        a.name = "��؎��Y";
        System.out.println(a.id + "�� " + a.name);
        System.out.println();


        example1(a);
        System.out.println(a.id + "�� " + a.name);
        System.out.println();
    }


    // ���\�b�h�ɂ͈����Ƃ��ăC���X�^���X�̎Q�Ƃ��󂯓n���ł���
    static void example1(StudentCard card) {
        card.id = 0;
        card.name = "����";
    }
}
