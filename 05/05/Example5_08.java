class StudentCard {
    int id;
    String name;
}


public class Example5_08 {


    public static void main(String[] args) {


        StudentCard a = new StudentCard();
        StudentCard b = new StudentCard();
        StudentCard c = new StudentCard();


        a.id = 1234;
        a.name = "鈴木次郎";
        b.id = 1235;
        b.name = "佐藤花子";
       
        System.out.println(a.id + "番 " + a.name);
        System.out.println(b.id + "番 " + b.name);
        System.out.println("idが小さいのは");
    	
    	c = example2(a, b);
    	
    	System.out.println(c.id + "番" + c.name);
    }
	
	// メソッドの戻り値に合う巣こともできる
	static StudentCard example2(StudentCard card0, StudentCard card1) {
		if (card0.id < card1.id){
			return card0;
		} else {
			return card1;
		}
	}
}
