import java.util.Scanner;
class A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int cnt = 0;
        if(a<=0){
            System.out.print("Invalid Input");
        }
        else{
            int count=0;
            for(int i=0;i<a;i++){
                count++;
                if(count==1){
                    System.out.print("5");
                }
                else{
                    if(cnt%2==0){
                        System.out.print(", 10");
                    }
                    else{
                        System.out.print(", 5");
                    }
                    cnt++;
                }
            }
        }
    }
}