public class Example5_09 {
    public static void main(String[] args) {
        StudentCard[] cards = new StudentCard[3];
        cards[0] = new StudentCard();
        cards[1] = new StudentCard();
        cards[2] = new StudentCard();


        cards[0].id = 1234;
        cards[0].name = "��ؑ��Y";
        cards[1].id = 1235;
        cards[1].name = "�����Ԏq";
        cards[2].id = 1236;
        cards[2].name = "�R�c��Y";


        for(int i=0; i<cards.length; i++){
            System.out.println(cards[i].id + "�� " + cards[i].name);
            System.out.println();    
        }
    }
}

