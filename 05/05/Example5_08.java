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
        a.name = "��؎��Y";
        b.id = 1235;
        b.name = "�����Ԏq";
       
        System.out.println(a.id + "�� " + a.name);
        System.out.println(b.id + "�� " + b.name);
        System.out.println("id���������̂�");
    	
    	c = example2(a, b);
    	
    	System.out.println(c.id + "��" + c.name);
    }
	
	// ���\�b�h�̖߂�l�ɍ��������Ƃ��ł���
	static StudentCard example2(StudentCard card0, StudentCard card1) {
		if (card0.id < card1.id){
			return card0;
		} else {
			return card1;
		}
	}
}
