import java.util.Scanner;
class A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1= sc.nextInt();
        int n2= sc.nextInt();
        int count=0;
        if(n1>n2){
            System.out.print("INVALID INPUTS");
            return;
        }
        for(int i=n1;i<=n2;i++){
            if(i%2==0){
                count++;
                if(count%2==1){
                    System.out.print(i+" ");
                }
            }
        }
        if(count==0){
            System.out.print("NO NUMBERS");
        }
    }
}