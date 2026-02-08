import java.util.Scanner;
class A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        char a = 'a';
        char A = 'A';
        char ch =sc.next().charAt(0);
        if(ch == 'a'){
            for(char i='a';i<='z';i++){
                System.out.print(i+" ");
            }
        }
        else{
            for(char i = 'A';i<='Z';i++){
                System.out.print(i+" ");
            }
        }
    }
}