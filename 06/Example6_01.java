class StudentCard {
    int id;
    String name;
    // コンストラクタ
    StudentCard(int id, String name) {
    this.id = id;
    this.name = name;
    }
}


public class Example6_01 {
    public static void main(String[] args) {
        StudentCard a = new StudentCard(1234, "鈴木太郎");
        System.out.println(a.id);
        System.out.println(a.name);
    }
}

