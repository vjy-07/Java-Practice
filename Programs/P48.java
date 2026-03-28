import java.util.Scanner;
class Main{
    int ram;
    int rom;
    String os;
    int osversion;
    String cam;
    String processor;
    String battery;
    String dtype;
    double price;
    
    Main(int ram, int rom, String os, int osversion, String cam,
    String processor, String battery,  String dtype, double price){
        this.ram = ram;
        this.rom = rom;
        this.os = os;
        this.osversion = osversion;
        this.cam = cam;
        this.processor = processor;
        this.battery=battery;
        this.dtype= dtype;
        this.price=price;
    }
    void display(){
        System.out.println(this.ram);
        System.out.println(this.rom);
        System.out.println(this.os);
        System.out.println(this.osversion);
        System.out.println(this.cam);
        System.out.println(this.processor);
        System.out.println(this.battery);
        System.out.println(this.dtype);
        System.out.println(this.price);
    }
    void wholesale(){
        price+=100;
    }
    
    void retail(){
        price+=200;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Main obj = new Main(sc.nextInt(), sc.nextInt(), sc.next(), sc.nextInt(), sc.next(), sc.next(), sc.next(), sc.next(), sc.nextDouble());
        obj.wholesale();
        obj.retail();
        obj.display();
    }
}