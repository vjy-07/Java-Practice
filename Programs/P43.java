class A{
    A(int a){
        System.out.println(a);
    }
}
class B extends A{
    B(){
        super(10);
        System.out.println("from B");
    }
    public static void main(String[] args){
        B obj = new B();
    }
}
