class A{
    int a =10;
    void m1(){
        System.out.println("m1 from A");
    }
}
class B extends A{
    void m2(){
        System.out.println("m2 from B");
        System.out.println(a);
        m1();
    }
    public static void main(String[] args){
        B obj = new B();
        obj.m2();
    }
}
