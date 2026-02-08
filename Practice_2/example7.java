import java.util.Scanner;
class A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        if(a>b){
            System.out.print("INVALID RANGE");
        }
        else{
            int c=0;
            for(int i=a+1;i<b;i++){
                if(i%2==0){
                    sum+=i;
                    c++;
                }
            }
            if(c==0){
                System.out.print("NO NUMBERS");
            }
            else{
                System.out.print(sum);
            }
        }
    }
}