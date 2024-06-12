class StudentCard {
    static int counter = 0;
    int id;
    String name;


    StudentCard(int id, String name) {
        this.id = id;
        this.name = name;
        StudentCard.counter++;
    }
}


public class Example6_03 {
    public static void main(String[] args) {


        StudentCard a = new StudentCard(1235, "佐藤花子");
        System.out.println(StudentCard.counter);
        System.out.println("id: " + a.id + " name: " + a.name);
        System.out.println();


        StudentCard b = new StudentCard(1236, "山田太郎");
        System.out.println(StudentCard.counter);
        System.out.println("id: " + b.id + " name: " + b.name);
        System.out.println();
    }
}

