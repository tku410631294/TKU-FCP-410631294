public class ch6_6 {
    public static void main(String[] args) {
        int a[]={432,32,12,32,5};
        int b[]={82,1,54,2,6};
        int c[]=a;

        c[0]=10;
        System.out.printf("a[0]=%d\n",a[0]);
        System.out.printf("a==b : %b\n", a==b);
        System.out.printf("a==c : %b\n", a==c);
    }
}
