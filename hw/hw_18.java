package hw;

public class hw_18 {
    public static void main(String[] args) {
        int arr[][][]={{{62,12,6},{81,21,21},{8,1,2}},{{91,12,82},{90,2,21},{92,73,2}},{{91,21,32},{1,2,4},{92,31,61}}};
        for(int a[][]:arr){
            for(int b[]:a){
                int sum=0;
                for(int c:b){
                    sum+=c;
                }
                System.out.println((sum/3));
            }
            
        }
    }
    
}
