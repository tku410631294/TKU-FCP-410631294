package hw;

import java.util.Scanner;

public class hm_06 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("輸入1 :");
        int a=scanner.nextInt();
        System.out.print("輸入2 :");
        int b=scanner.nextInt();
        System.out.println("和 :"+(a+b));
        scanner.close();
    }
    
}
