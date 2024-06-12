class Example4_09 {
    public static void methodA() {
        System.out.println("ˆø”‚Í‚ ‚è‚Ü‚¹‚ñ");
    }
    public static void methodA(int i) {
        System.out.println("intŒ^‚Ì’l" + i + "‚ğó‚¯æ‚è‚Ü‚µ‚½");
    }
    public static void methodA(double d) {
        System.out.println("doubleŒ^‚Ì’l" + d + "‚ğó‚¯æ‚è‚Ü‚µ‚½");
    }
    public static void methodA(String s) {
        System.out.println("•¶š—ñ" + s + "‚ğó‚¯æ‚è‚Ü‚µ‚½");
    }
    public static void main(String[] args) {
        methodA();
        methodA(1);
        methodA(0.1);
        methodA("Hello");
    }
}
