class A {
    A(){
        System.out.println("A�R���X�g���N�^");
    }
    void abc() {
        System.out.println("abc���\�b�h");
    }
    void def() {
        System.out.println("def���\�b�h");
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
