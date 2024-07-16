package hw;

public class hw_16 {
    public static void main(String[] args) {
        int arr[][][]={{{62,12},{81,21}},{{91,12},{90,2}}};
        int sum=0;
        for(int a[][]:arr){
            for(int b[]:a){
                for(int c:b){
                    sum+=c;
                }
                
            }
            
        }
        System.out.println(sum);
    }
    
}
