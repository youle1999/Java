class StudentCard {
    int id;
    String name;
    // �R���X�g���N�^
    StudentCard(int id, String name) {
    this.id = id;
    this.name = name;
    }
}


public class Example6_01 {
    public static void main(String[] args) {
        StudentCard a = new StudentCard(1234, "��ؑ��Y");
        System.out.println(a.id);
        System.out.println(a.name);
    }
}

