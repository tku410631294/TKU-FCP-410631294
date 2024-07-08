package hw;

import java.util.Scanner;

public class hm_07 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("輸入圓半徑  :");
        int a=scanner.nextInt();
        
        System.out.println("和 :"+(a*a*Math.PI));
        scanner.close();
    }
    
}
