class A{
    int a =10;
}
class B extends A{
    int a = 20;
    void m2(int a){
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(super.a);
    }
    public static void main(String[] args){
        B obj = new B();
        obj.m2(30);
    }
}
