import java.util.Scanner;
class Main{
    int accNo;
    static String ifsc = "sbin000000";
    int pin;
    int balance;
    Main(int accNo, int pin, int balance){
        this.accNo= accNo;
        this.pin=pin;
        this.balance = balance;
    }
    void display(){
        System.out.println(this.accNo);
        System.out.println(ifsc);
        System.out.println(this.pin);
        System.out.println(this.balance);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Main user = new Main(sc.nextInt(), sc.nextInt(), sc.nextInt());
        user.display();
    }
}