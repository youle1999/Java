class Dog {
    String name;
}


public class Example5_02 {
    public static void main(String[] args) {
    Dog dog1 = new Dog();
    dog1.name = "Taro";
    Dog dog2 = new Dog();
    dog2.name = "Pochi";
    Dog dog3 = dog2;
   
    System.out.println(dog3.name);
    dog3.name = "Jiro";
    System.out.println(dog2.name);
    }
}
