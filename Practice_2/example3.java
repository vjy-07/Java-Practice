import java.util.Scanner;
class A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        int count = 0;
        if(a>b){
            System.out.println("INVALID RANGE");
        }
        else{
            for(int i=a;i<=b;i++){
                if(i%2==0){
                    count++;
                    sum+=i;
                }
            }
        float avg = (float)sum/count;
        System.out.print(avg);
        }
    }
}
