package hw;
import java.unti.*;
import java.util.Scanner;

public class hm_09 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("輸入長:");
        int a=scanner.nextInt();
        System.out.print("輸入寬:");
        int b=scanner.nextInt();
        System.out.println("面積:"+(a*b));
        scanner.close();
        
        
    }
    
}
