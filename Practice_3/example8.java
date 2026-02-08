import java.util.Scanner;
class A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count=0;
        for(int i=1;i<=a;i+=2){
            count++;
            if(count==1){
                System.out.print(i);
            }
            else{
                if(i%5==0){
                    System.out.print(", divisible by five");
                }
                else{
                    System.out.print(", "+i);
                }
            }
        }
    }
}