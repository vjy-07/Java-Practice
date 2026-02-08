import java.util.Scanner;
class A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a<=0 || b<=0){
            System.out.print("Invalid Inputs");
        }
        else{
            int count=0;
            for(int i=a;i<=b;i+=2){
                count++;
                if(count==1){
                    System.out.print(i+"^2");
                }
                else{
                    System.out.print(", "+i+"^2");
                }
            }
        }
    }
}