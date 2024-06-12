import java.util.Scanner;

class DataSet {
    int i;          //0‚Å‰Šú‰»‚³‚ê‚é
    double d;       // 0.0‚Å‰Šú‰»‚³‚ê‚é
    boolean b;      // false‚Å‰Šú‰»‚³‚ê‚é
    String s;       // null‚Å‰Šú‰»‚³‚ê‚é
    DataSet data;   // null‚Å‰Šú‰»‚³‚ê‚é
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
		
		System.out.print("i‚Í:"); dataset.i = in.nextInt();
		System.out.print("d‚Í:"); dataset.d = in.nextDouble();
		System.out.print("b‚Í:"); dataset.b = in.nextBoolean();
		System.out.println("s‚Í:"); dataset.s = in.next();
		dataset.data = dataset;
		
		System.out.println(dataset.i);
		System.out.println(dataset.d);
		System.out.println(dataset.b);
		System.out.println(dataset.s);
		System.out.println(dataset.data);
	}
}

