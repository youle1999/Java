class StudentCard {
    int id;
    String name;


    void printInfo() {
        System.out.println(this.id);
        System.out.println(this.name);
    }
}


class IStudentCard extends StudentCard {
    String nationality; // çëê–
}


public class Example7_01 {
    public static void main(String[] args) {
        IStudentCard a = new IStudentCard();


        a.id = 2345;
        a.name = "John Smith";
        a.nationality = "ÉCÉMÉäÉX";


        a.printInfo(); //Ç±ÇÃÇ‹Ç‹ÇæÇ∆çëê–ÇÕï\é¶Ç≥ÇÍÇ»Ç¢
    }
}

