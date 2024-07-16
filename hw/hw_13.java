package hw;

public class hw_13 {
    public static void main(String[] args) {
        int arr[][]={{12,13,65,123},{19,8,76,127},{82,12,41,83},{98,23,12,2}};
        for(int i[]:arr){
            int sum=0;
            for(int a :i){
                sum+=a;
                

            }
            System.out.println(sum);
        }
    }
}