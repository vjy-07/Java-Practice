import java.util.Scanner;
class A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = 0;
        while(n>0){
            int r = n%10;
            if(r>h){
                h=r;
            }
            n/=10;
        }
        System.out.print(h);
    }
}