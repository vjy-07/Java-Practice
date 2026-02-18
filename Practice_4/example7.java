import java.util.Scanner;
class A{
  
  static boolean isPrime(int n){
    for(int i=2;i<=(int)Math.sqrt(n);i++){
      if(n%i==0){
        return false;
      }
    }
    return true;
  }
  
  static int beforePrime(int n){

    for(int i=n;i>=2;i--){
      if(isPrime(i)){
        return i;
      }
    }
    return -1;
  }
  static int afterPrime(int n){

    for(int i=n; ;i++){
      if(isPrime(i)){
        return i;
      }
    }
  }
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int bp = beforePrime(n-1);
    int ap = afterPrime(n+1);
    int bd = n-bp;
    int ad = ap-n;
    if(bd<ad) System.out.print(bp);
    else if(ad<bd) System.out.print(ap);
    else{
      System.out.print(ap+" "+bp);
    }
  }
}