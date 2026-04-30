import java.util.*;
class Main
{
    public static void main(String[] args)
    {
      Scanner sc =new Scanner(System.in);
      int n=sc.nextInt();
      if(n<=0){
          System.out.print("Invalid Array size.");
          return;
      }
      int arr[]=new int[n];
      for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
      }
      int nth =sc.nextInt();
      if(nth<=0 || nth>n){
          System.out.print("Invalid nth value.");
          return;
      }
      Arrays.sort(arr);
      System.out.print(arr[n-nth]);
    }
}
