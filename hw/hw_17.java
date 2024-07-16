package hw;

public class hw_17 {
    public static void main(String[] args) {
        int arr[][][]={{{62,12},{81,21}},{{91,12},{90,2}}};
        int k[][][]=arr;
        k[1][0][1]=5;
        for(int a[][]:arr){
            for(int b[]:a){
                for(int c:b){
                    System.out.printf("%d ",c);
                }
                
            }
            
        }
    }
    
}

