class StudentCard {
    int id;
    String name;
}


public class Example5_07 {
    public static void main(String[] args) {


        StudentCard a = new StudentCard();


        a.id = 1234;
        a.name = "鈴木次郎";
        System.out.println(a.id + "番 " + a.name);
        System.out.println();


        example1(a);
        System.out.println(a.id + "番 " + a.name);
        System.out.println();
    }


    // メソッドには引数としてインスタンスの参照を受け渡しできる
    static void example1(StudentCard card) {
        card.id = 0;
        card.name = "未定";
    }
}
