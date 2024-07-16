package hw;

public class hw_11 {
    public static void main(String[] args) {
        int arr[]={28,12,31323,2,213,2234,2123,92,12,42};
        int max=0;
        for(int i :arr){
            if (i>max) {
                max=i;
                
            }
        }
        System.out.println(max);
    }
    
}
