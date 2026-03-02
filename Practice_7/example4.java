import java.util.Scanner;
class A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n>0){
            int r = n%10;
            if(r%2==0){
                System.out.println(r);
            }
            n/=10;
        }
    }
}