import java.util.Scanner;
class Main
{
public static void main(String[]args)
{

    Scanner sc = new Scanner(System.in);
    int n = Math.abs(sc.nextInt());
    if(n==0){
        System.out.print("Zero");
        return;
    }
    for(int i=1;i<=n;i++){
        if(i!=1) System.out.print(", ");
        if(i%3==1){
            System.out.print("1");
        }
        else if(i%3==2){
            System.out.print("A");
        }
        else if (i%3==0){
            System.out.print("@");
        }
    }
    
}
}
