import java.util.Scanner;
class A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String hex = sc.next();
        int dec = 0, c=0;
        boolean isNeg=false;
        for(int i=hex.length()-1;i>=0;i--){
            int val = 0;
            char ch = hex.charAt(i);
            if(ch>='0'&& ch<='9'){
                val = ch-'0';
            }
            else if(ch>='A' && ch<='F'){
                val = ch-55;
            }
            else if(ch>='a' && ch<='f'){
                val = ch-87;
            }
            else if(ch=='-'){
                isNeg=true;
                continue;
            }
            else{
                System.out.print("InvaliD Input");
                return;
            }
            dec+=val*(int)Math.pow(16,c++);
        }
        String oct="";
        int temp = dec;
        while(dec>0){
            int r = dec%8;
            oct=r+oct;
            dec/=8;
        }
        if(temp==0){
            System.out.print("0");
        }
        else if(isNeg){
            System.out.print(hex+" -> "+oct);
        }
        else{
            System.out.print(oct);
        }
    }
}
