import java.util.Scanner;
class A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float n1 = sc.nextFloat();
        float n2 = sc.nextFloat();
        for(float i=n1;i<=n2;i+=0.2){
            if(i!=n1) System.out.print(", ");
            System.out.printf("%.1f^2",i);
        }
        System.out.print(".");
    }
}