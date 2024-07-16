import java.util.*;

public class ge {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int year=scanner.nextInt();
        int moon =scanner.nextInt();
        switch (moon) {
            case 1:case 3:case 5: case 7:case 8: case 10:case 12:
                System.out.println("31");
                break;
            case 4: case 6:case 9: case 11:
                System.out.println("30");
                break;
            case 2:
                if(year/400==0 ||(year/4==0 && year/100!=0)){
                    System.out.println("30");
                }
                else{
                    System.out.println("29");
                }
            

                
                break;
            default:
                break;
        }


        
       
        
    }
    
}
