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
            for(int i=a;i<=b;i++){
                int sq = i*i;
                sum+=sq;
            }
            System.out.print(sum);
        }
    }
}