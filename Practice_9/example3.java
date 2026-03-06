import java.util.Scanner;
class A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        boolean isMember = sc.nextBoolean();
        boolean is3DMovie = sc.nextBoolean();
        int basePrice = 10;
        int price = 0;
        if(age<13 || age>=65){
            price = 7;
            if(isMember){
                price-=2;
                if(is3DMovie && age>=7){
                    price+=3;
                }
                if(is3DMovie && age<7){
                    System.out.print("Access Denied");
                    return;
                }
                System.out.print("Rs. "+price);
            }
            else{
                if(is3DMovie && age>=7){
                    price+=3;
                }
                if(is3DMovie && age<7){
                    System.out.print("Access Denied");
                    return;
                }
                System.out.print("Rs. "+price);
            }
        }
        else{
            if(isMember){
                price = basePrice-2;
                if(is3DMovie){
                    price+=3;
                    System.out.print("Rs. "+price);
                }
                else{
                    System.out.print("Rs. "+price);
                }
            }
            else{
                price = basePrice;
                if(is3DMovie){
                    price+=3;
                    System.out.print("Rs. "+price);
                }
                else{
                    System.out.print("Rs. "+price);
                }
            }
        }
    }
}
