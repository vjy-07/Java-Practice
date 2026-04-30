import java.util.*;
class Main
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt=4;
        if(n<=0){
            System.out.print("Invalid Array Size.");
            return;
        }
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int l = arr[0];
        for(int i=l+1;;i++){
            boolean flag = false;
            int s=0, e=n-1;
            while(s<=e){
                int mid= (s+e)/2;
                if(arr[mid]==i){
                    flag = true;
                    break;
                }
                else if(arr[mid]<i){
                    s = mid+1;
                }
                else if(arr[mid]>i){
                    e = mid-1;
                }
            }
            if(cnt==0) return;
            if(flag == false){ 
                System.out.print(i+" ");
                cnt--;
            }
            if(flag == true) flag =false;
        }
        
    }
}
