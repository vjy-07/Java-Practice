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
            if(a%2==0){
                for(int i=a+2;i<b;i++){
                    System.out.print(i+" ");
                    i+=3;
                }
            }
            else{
                for(int i=a+1;i<b;i++){
                    System.out.print(i+" ");
                    i+=3;
                }
            }
        }
    }
}