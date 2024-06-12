class Example4_03 {
    public static void countdown(int start){
        System.out.println("カウントダウンをします");
        for(int i = start; i >= 0; i--){
            System.out.println(i);
        }
    }


    public static void main(String[] args) {
        countdown(3);
        countdown(10);
    }
}
