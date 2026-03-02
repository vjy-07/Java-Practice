import java.util.Scanner;
class A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = 9;
        while(n>0){
            int r = n%10;
            if(r<l){
                l=r;
            }
            n/=10;
        }
        System.out.print(l);
    }
}