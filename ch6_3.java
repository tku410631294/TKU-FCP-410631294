public class ch6_3 {
    public static void main(String[] args) {
        int arr[]={92,123,33,6,2,134,3};
        int max=arr[0];
    
    for(int i:arr){
        if (i>max) {
            max=i;
            
        }
    }
    System.out.println(max);

    }

}
