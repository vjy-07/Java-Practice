import java.util.Scanner;
class A{
    static boolean isPalindrome(int n){
        int rev=n;
        int sum=0;
        while(n>0){
            int r=n%10;
            sum=sum*10+r;
            n/=10;
        }
        return rev==sum;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int r =sc.nextInt();
        int c = sc.nextInt();
        int arr[][]= new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
                if(isPalindrome(arr[i][j])){
                    System.out.println(arr[i][j]);
                }
            }
        }
        
    }
}