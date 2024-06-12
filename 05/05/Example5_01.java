class StudentCard {
    int id; // ŠwĞ”Ô†
    String name; // –¼
}


public class Example5_01 {
    public static void main(String[] args) {
    StudentCard a = new StudentCard();
    a.id = 1234;
    a.name = "—é–Ø‘¾˜Y";
    StudentCard b = new StudentCard();
    b.id = 1235;
    b.name = "²“¡‰Ôq";
    System.out.println("a‚Ìid‚Í" + a.id);
    System.out.println("a‚Ìname‚Í" + a.name);
    System.out.println("b‚Ìid‚Í" + b.id);
    System.out.println("b‚Ìname‚Í" + b.name);
    }
}
