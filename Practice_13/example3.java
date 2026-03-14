import java.util.*;

class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int a = sc.nextInt();
      int r = sc.nextInt();
      for(int i=0;i<n;i++){
        System.out.println(a*(int)Math.pow(r,i));
      }

    }
}