import java.util.Scanner;
class A{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int c = 0;
    for(int i=1; ; i++){
      if(isPrime(i)){
        c++;
        System.out.print(i+" ");
        if(c==n) break;
      }
    }
  }
  static boolean isPrime(int x){
    int fc = 0;
    for(int i=2;i<=(int)Math.sqrt(x);i++){
      if(x%i==0){
        fc++;
      }
    }
    if(fc==0 && x>1){
      return true;
    }
    else{
      return false;
    }
  }
}