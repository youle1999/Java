import java.util.Scanner;

class DataSet {
    int i;          //0で初期化される
    double d;       // 0.0で初期化される
    boolean b;      // falseで初期化される
    String s;       // nullで初期化される
    DataSet data;   // nullで初期化される
}

public class Example5_10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		DataSet dataset = new DataSet();
		
		System.out.println(dataset.i);
		System.out.println(dataset.d);
		System.out.println(dataset.b);
		System.out.println(dataset.s);
		System.out.println(dataset.data);
		
		System.out.print("iは:"); dataset.i = in.nextInt();
		System.out.print("dは:"); dataset.d = in.nextDouble();
		System.out.print("bは:"); dataset.b = in.nextBoolean();
		System.out.println("sは:"); dataset.s = in.next();
		dataset.data = dataset;
		
		System.out.println(dataset.i);
		System.out.println(dataset.d);
		System.out.println(dataset.b);
		System.out.println(dataset.s);
		System.out.println(dataset.data);
	}
}

