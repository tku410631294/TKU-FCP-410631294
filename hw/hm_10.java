package hw;
import java.until.*;
import java.util.Scanner;

public class hm_10 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("輸入溫度");
        int F=scanner.nextInt();
        System.out.print("輸出溫度"+((F - 32) * 5/9));
        scanner.close();

        
    }
    
}
