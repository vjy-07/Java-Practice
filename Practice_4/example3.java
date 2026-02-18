import java.util.Scanner;
class Main{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int n = sc.nextInt();
        int cnt = 0;
        for(int i=1;i<=n;i++){
            cnt++;
            if(i%3==1){
                if(cnt==1){
                    System.out.print("1");
                }
                else{
                    System.out.print(", 1");
                }
            }
            else if(i%3 == 2){
                System.out.print(", A");
            }
            else{
                System.out.print(", @");
            }
        }
    }
}