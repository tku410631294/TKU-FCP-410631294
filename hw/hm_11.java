package hw;
import java.until.*;
import java.util.Scanner;

public class hm_11 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("商品A");
        int a=scanner.nextInt();
        System.out.print("商品B");
        int b=scanner.nextInt();
        System.out.print("商品C");
        int c=scanner.nextInt();
        System.out.print("總價"+(a+b+c));
        scanner.close();


        
    }
    
}
