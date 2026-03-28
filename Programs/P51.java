import java.util.Scanner;

class A{
    int a = 10;
}
class Main extends A{
    int a = 20;
    void display(){
        System.out.println(super.a);
        System.out.println(this.a);
    }
    public static void main(String[] args){
        new Main().display();
    }
}

