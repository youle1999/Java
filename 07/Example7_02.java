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


    void printInfo() {
        System.out.println("IStudentCard�N���X�̃��\�b�h");
        System.out.println(this.id);
        System.out.println(this.name);
        System.out.println(this.nationality);
    }
}


public class Example7_02 {
    public static void main(String[] args) {
        IStudentCard a = new IStudentCard();


        a.id = 2345;
        a.name = "John Smith";
        a.nationality = "�C�M���X";


        a.printInfo(); //IStudentCard�N���X��printInfo���\�b�h�����s�����
    }
}

