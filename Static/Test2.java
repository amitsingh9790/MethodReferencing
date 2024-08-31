package MethodReferencing.Static;

interface I2{
    void m1(String name);
}
class A{
    public A(String s) {
        System.out.println(s);
    }

    static void m2(String name){
        System.out.println("Hello from "+name);
    }
}
public class Test2 {
    public static void main(String[] args) {
        I2 i = A::new;
        i.m1("Amit");
    }
}
