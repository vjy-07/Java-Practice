class A{
    int a =10;
    void m1(){
        System.out.println("m1 from A");
    }
}
class B{
    static A obj = new A();
    void m2(){
        System.out.println("m2 from B");
        obj.m1();
        System.out.println(obj.a);
    }
}
class Main{
    public static void main(String[] args){
        B obj = new B();
        obj.m2();
    }
}