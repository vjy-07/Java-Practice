import java.util.Scanner;
class Main{
    int empid;
    String empdes;
    int sal;
    String loc;
    
    Main(int empid, String empdes, int sal, String loc){
        this.empid = empid;
        this.empdes= empdes;
        this.sal = sal;
        this.loc = loc;
    }
    
    void display(){
        System.out.println(this.empid);
        System.out.println(this.empdes);
        System.out.println(this.sal);
        System.out.println(this.loc);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Main emp1 = new Main(1,"sde",1000,"hyd");
        Main emp2 = new Main(2,"tl",2000,"chennai");
        Main emp3 = new Main(3,"dev",3000,"pune");
        Main emp4 = new Main(4,"testing",4000,"bangalore");
        Main emp5 = new Main(5,"cs",5000,"hyd");
        emp1.display();
        emp2.display();
        emp3.display();
        emp4.display();
        emp5.display();
    }
}