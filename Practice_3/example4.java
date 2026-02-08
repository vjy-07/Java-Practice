import java.util.Scanner;
class A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a>b){
            int count=0;
            for(int i = a; i>=b; i--){
                count++;
                if(i>=0){
                    if(count==1){
                        System.out.print("5*"+i);
                    }
                    else{
                        System.out.print(", 5*"+i);
                    }
                }
                else{
                    int cnt = 0;
                    if(count==1){
                        cnt++;
                    }
                    if(cnt==1){
                        System.out.print("5*("+i+")");
                    }
                    else{
                        System.out.print(", 5*("+i+")");
                    }
                }
            }
        }
        else{
            int count = 0;
            for(int i=a;i<=b;i++){
                count++;
                if(i<0){
                    if(count==1){
                        System.out.print("5*("+i+")");
                    }
                    else{
                        System.out.print(", 5*("+i+")");
                    }
                }
                else{
                    int cnt =0;
                    if(count==1){
                        cnt++;
                    }
                    if(cnt==1){
                        System.out.print("5*"+i);
                    }else{
                        System.out.print(", 5*"+i);
                    }
                }
            }
        }
    }
}
