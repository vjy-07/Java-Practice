import java.util.Scanner;
class A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count=0;
        if(a>b){
            System.out.print("INVALID RANGE");
        }
        else{
            
            for(int i=a;i<=b;i++){
                if(i%2==0){
                    count++;
                }
            }
            if(count==0){
                System.out.print("NO NUMBERS");
            }
            else{
                System.out.print(count);
            }
        }
    }
}