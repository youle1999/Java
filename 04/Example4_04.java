class Example4_04 {
    public static void countdown(int start, int end) {
        System.out.println("カウントダウンをします");
        for (int i = start; i >= end; i--) {
            System.out.println(i);
        }
    }


    public static void main(String[] args) {
        countdown(7, 3);
    	countdown(10,2);
    }
}

