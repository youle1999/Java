class StudentCard {
    // 必要なフィールドを埋めよう
     int id; // 学籍番号
    String name; // 氏名
}


public class Example5_03 {
    public static void main(String[] args) {
        StudentCard a = new StudentCard();
        StudentCard b = new StudentCard();
        StudentCard c = b;
        a.id = 1234;
        a.name = "鈴木太郎";
        b.id = 1235;
        b.name = "佐藤花子";


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

