class StudentCard {
    int id;
    String name;


    void printInfo() {
        System.out.println(this.id);
        System.out.println(this.name);
    }
}


class IStudentCard extends StudentCard {
    String nationality; // 国籍


    void printInfo() {
        System.out.println("IStudentCardクラスのメソッド");
        super.printInfo(); //スーパークラスのメソッドを実行する
        System.out.println(this.nationality);
    }
}


public class Example7_03 {
    public static void main(String[] args) {
        IStudentCard a = new IStudentCard();


        a.id = 2345;
        a.name = "John Smith";
        a.nationality = "イギリス";


        a.printInfo(); //IStudentCardクラスのprintInfoメソッドが実行される
    }
}

