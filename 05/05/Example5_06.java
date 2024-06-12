class StudentCard {
    // 必要なフィールドを入力済み
    int id;
    String name;
}


public class Example5_06 {
    public static void main(String[] args) {
        // nullは参照型の変数の値と?較できる
        StudentCard a = new StudentCard();


        // nullは、参照型の変数に代?できる
        a = null; // 指示に従ってコメントアウトする


        if (a == null) {
            System.out.println("aはnull");
        } else {
            System.out.println("aはnullではない");
        }


    }
}

