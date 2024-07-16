public class ch6_4 {
    public static void main(String[] args) {
        int sum=0;
        int arr[][]={{98,21,32,44},{82,21,12,3}};
        for(int i[]:arr){
            for(int a:i){
                System.out.printf("%3d", a);
                sum+=a;
            }
            System.out.println();

        }
        System.out.printf("%d", sum);


    }
    
}
