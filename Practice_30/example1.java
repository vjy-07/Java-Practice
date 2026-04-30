import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt=0;
        if(n<=0){
            System.out.print("Invalid Array Size.");
            return;
        }
        char arr[]=new char[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.next().charAt(0);
            if((arr[i]>='a' && arr[i]<='z') || (arr[i]>='A' && arr[i]<='Z')){
                continue;
            }
            else{
                System.out.print("Invalid Array Elements.");
                return;
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u' || arr[i]=='A' || arr[i]=='E' || arr[i]=='I' || arr[i]=='O' || arr[i]=='U'){
                continue;
            }
            else{
                cnt++;
            }
        }
        if(cnt==0){
            System.out.print("No consonants found.");
        }
        else{
            System.out.print(cnt);
        }
    }
}
