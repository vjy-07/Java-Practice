import java.util.Scanner;
class Main
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        if(temp<0){
            temp = -temp;
        }
        if(n==0){
            System.out.print("InvaliD Input");
            return;
        }
        int count=0;
        while(temp>0){
            int r=temp%10;
            count++;
            temp/=10;
        }
        if(n>0 && count!=1){
            System.out.print("Given Number consists of "+count+" Digits.");
            return;
        }
        else if(n>0 && count==1){
            System.out.print("Given Number consists of only "+count+" Digit.");
            return;
        }
        else if(n<0 && count!=1){
            System.out.print("Given Number consists of "+count+" Digits and it is Negative Value.");
            return;
        }
        else{
            System.out.print("Given Number consists of only "+count+" Digit and it is Negative Value.");
        }
    }
}
