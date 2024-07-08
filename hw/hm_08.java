package hw;

import java.util.Scanner;

public class hm_08 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("姓名 ");
        String a=scanner.next();
        System.out.print("年齡 ");
        String b=scanner.next();
        System.out.print("城市 ");
        String c=scanner.next();
        System.out.print(a+", "+b+", "+c);
        scanner.close();
    }
    
}
