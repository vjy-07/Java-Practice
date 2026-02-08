import java.util.Scanner;
class A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a>b){
            System.out.print("INVALID INPUTS");
        }
        else{
            int count=0;
            if(a%2==0){
                for(int i=a;i<=b;i++){
                    if(i%2==0){
                        System.out.print(i+" ");
                        count++;
                    }
                    i+=3;
                }
                if(count==0){
                    System.out.print("NO NUMBERS");
                }
            }
            else{
                int count1=0;
                for(int i=a+1;i<=b;i++){
                    if(i%2==0){
                        System.out.print(i+" ");
                        count1++;
                    }
                    i+=3;
                }
                if(count1==0){
                    System.out.print("NO NUMBERS");
                }
            }
        }
    }
}
