class X {
    X() {
        System.out.println("[X()]");  // Prints when the default constructor of X is called
    }
    X(int i) {
        System.out.println("[X(int i)]");  // Prints when the parameterized constructor of X is called
    }
}

class Y extends X {
    Y() {
        System.out.println("[Y()]");  // Prints when the default constructor of Y is called
    }
    Y(int i) {
        System.out.println("[Y(int i)]");  // Prints when the parameterized constructor of Y is called
    }
}

class Z extends Y {
    Z() {
        System.out.println("[Z()]");  // Prints when the default constructor of Z is called
    }
}

public class Enshu7_p17 {
    public static void main(String[] args) {
        Z z = new Z();  // Creates an instance of Z, which triggers the constructor chain
    }
}
