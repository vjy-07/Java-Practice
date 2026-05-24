import java.util.*;
class A{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        String s = sc.nextLine();
        String arr[] = s.split(" ");
        String longest ="";
        for(int i=0;i<arr.length;i++){
            if(arr[i].length()> longest.length()){
                longest = arr[i];
            }
        }
        System.out.print(longest);
    }
}