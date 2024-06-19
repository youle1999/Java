class A {
    A(){
        System.out.println("Aコンストラクタ");
    }
    void abc() {
        System.out.println("abcメソッド");
    }
    void def() {
        System.out.println("defメソッド");
    }
}


class B extends A {
    B() {
        abc();
    }


    B(int i) {
        def();
    }
}


public class Example7_04 {
    public static void main(String[] args) {
       B b1 = new B();
       B b2 = new B(1);
    }
}
