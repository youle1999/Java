import java.util.Scanner;


class A {
    A(int n) {
        for(int i=0; i<n; i++){
            System.out.println(i+":引数付きAコンストラクタ");
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
        System.out.print("回数:");
        int i = in.nextInt();        


        B b2 = new B(i);
    }
}
