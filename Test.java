package MethodReferencing;

interface I1{
    void m1();
}
class A {
    public void m2(){
        System.out.println("Hi from m1()");
    }
}

public class Test {
    public static void main(String[] args) {
        A ob = new A();
        I1 i = ob::m2;
        i.m1();
    }
}
