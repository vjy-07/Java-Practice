class A{
    int a =10;
    void m1(){
        System.out.println("m1 from A");
    }
}
class B{
    void m2(){
        A obj = new A();
        System.out.println("m2 from B");
        obj.m1();
    }
}
class Main{
    public static void main(String[] args){
        B obj = new B();
        obj.m2();
    }
}