import java.util.Scanner;

class DataSet {
    int i;          //0�ŏ����������
    double d;       // 0.0�ŏ����������
    boolean b;      // false�ŏ����������
    String s;       // null�ŏ����������
    DataSet data;   // null�ŏ����������
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
		
		System.out.print("i��:"); dataset.i = in.nextInt();
		System.out.print("d��:"); dataset.d = in.nextDouble();
		System.out.print("b��:"); dataset.b = in.nextBoolean();
		System.out.println("s��:"); dataset.s = in.next();
		dataset.data = dataset;
		
		System.out.println(dataset.i);
		System.out.println(dataset.d);
		System.out.println(dataset.b);
		System.out.println(dataset.s);
		System.out.println(dataset.data);
	}
}

