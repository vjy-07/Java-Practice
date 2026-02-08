import java.util.Scanner;
class A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count=0;
        if(a>b){
            for(int i=a;i>=b;i--){
                count++;
                if(i>=0){
                    if(count==1){
                        System.out.print(i*5);
                    }
                    else{
                        System.out.print(", "+(i*5));
                    }
                }
                else{
                    int cnt = 0;
                    if(count==1){
                        cnt++;
                    }
                    if(cnt==1){
                        System.out.print("("+(i*5)+")");
                    }
                    else{
                        System.out.print(", ("+(i*5)+")");
                    }
                }
                
            }
        }
        else{
            int count1=0;
            for(int i=a;i<=b;i++){
                count1++;
                if(i<0){
                    if(count1==1){
                        System.out.print("("+(i*5)+")");
                    }
                    else{
                        System.out.print(", ("+(i*5)+")");
                    }
                }
                else{
                    int cnt = 0;
                    if(count1==1){
                        cnt++;
                    }
                    if(cnt==1){
                        System.out.print(i*5);
                    }
                    else{
                        System.out.print(", "+i*5);
                    }
                }
            }
        }
    }
}