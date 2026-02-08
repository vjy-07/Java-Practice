import java.util.Scanner;
class Main
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count=0;
        if(a>b){
            a=a+b-(b=a);
        }
        for(int i=a;i<=b;i++){
            count++;
            if(count==1){
                System.out.print(i+"*"+(i+1));
            }
            else{
                System.out.print(", "+i+"*"+(i+1));
            }
        }
        System.out.println();
        int count1=0;
        for(int i=a;i<=b;i++){
            count1++;
            if(count1==1){
                System.out.print(i*(i+1));
            }
            else{
                System.out.print(", "+(i*(i+1)));
            }
        }
    }
}