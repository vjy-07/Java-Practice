import java.util.Scanner;
class Main
{
public static void main(String[]args)
{
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if(n<=0){
        System.out.println("Invalid Input");
        return;
    }
    for(int i=1;i<=n;i++){
        if(i%2==0 && i%3!=0){
            System.out.println("Fizz");
        }
        else if(i%3==0 && i%2!=0){
            System.out.println("Buzz");
        }
        else if(i%2==0 && i%3==0){
            System.out.println("Fizz Buzz");
        }
        else{
            System.out.println(i);
        }
    }
}
}