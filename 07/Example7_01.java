class StudentCard {
    int id;
    String name;


    void printInfo() {
        System.out.println(this.id);
        System.out.println(this.name);
    }
}


class IStudentCard extends StudentCard {
    String nationality; // ����
}


public class Example7_01 {
    public static void main(String[] args) {
        IStudentCard a = new IStudentCard();


        a.id = 2345;
        a.name = "John Smith";
        a.nationality = "�C�M���X";


        a.printInfo(); //���̂܂܂��ƍ��Ђ͕\������Ȃ�
    }
}

