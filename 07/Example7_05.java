import java.util.Scanner;


class A {
    A(int n) {
        for(int i=0; i<n; i++){
            System.out.println(i+":�����t��A�R���X�g���N�^");
        }
    }
}


class B extends A {
    B(int x) {
        super(x);
    }
}


public class Example7_05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("��:");
        int i = in.nextInt();        


        B b2 = new B(i);
    }
}
