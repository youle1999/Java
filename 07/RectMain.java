import java.util.Scanner;

public class RectMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("•: ");
        int w = in.nextInt();
        
        System.out.print("‚‚³: ");
        int h = in.nextInt();
        
        System.out.print("‰œs‚«: ");
        int d = in.nextInt();
        
        Cube c = new Cube(w, h, d);
        
        System.out.println("–ÊÏ: " + c.getArea());
        System.out.println("‘ÌÏ: " + c.getVolume());
    }
}
