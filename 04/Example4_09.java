class Example4_09 {
    public static void methodA() {
        System.out.println("�����͂���܂���");
    }
    public static void methodA(int i) {
        System.out.println("int�^�̒l" + i + "���󂯎��܂���");
    }
    public static void methodA(double d) {
        System.out.println("double�^�̒l" + d + "���󂯎��܂���");
    }
    public static void methodA(String s) {
        System.out.println("������" + s + "���󂯎��܂���");
    }
    public static void main(String[] args) {
        methodA();
        methodA(1);
        methodA(0.1);
        methodA("Hello");
    }
}
