class StudentCard {
    int id;
    String name;


    StudentCard() {
        this.id = 0;
        this.name = "����";
    }


    StudentCard(String name) {
        this.id = 0;
        this.name = name;
    }


    StudentCard(int id, String name) {
        this.id = id;
        this.name = name;
    }
}


public class Example6_02 {
    public static void main(String[] args) {
        StudentCard a = new StudentCard();
        System.out.println("id: " + a.id + " name: " + a.name);
        System.out.println();


        StudentCard b = new StudentCard("��ؑ��Y");
        System.out.println("id: " + b.id + " name: " + b.name);
        System.out.println();


        StudentCard c = new StudentCard(1235, "�����Ԏq");
        System.out.println("id: " + c.id + " name: " + c.name);
        System.out.println();
    }
}



