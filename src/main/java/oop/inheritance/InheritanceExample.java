package oop.inheritance;

public class InheritanceExample {
    interface A {
        int sum(int x, int y);
    }

    static class B implements A{
        public int diff(int x, int y){return x - y;}
        public int sum(int x, int y){return x + y;}
    }

    static class C extends B{
        public int mult(int x, int y){return x * y;}
        public int diff(int x, int y){return y - x;}
    }

    public static void main(String[] args) {
        A aB = new B();
        A aC = new C();
        B bB= new B();
        B bC= new C();
        C cC = new C();
        System.out.println(bC.diff(1,2));
//        System.out.println(bC.mult(2,2));
        System.out.println(aC.sum(1,1));
//        System.out.println(aB.diff(1,1));
        System.out.println(bB.diff(1,2));
    }
}
