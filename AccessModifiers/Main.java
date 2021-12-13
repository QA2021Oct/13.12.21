package com.company;

import SecondPackage.B;
import SecondPackage.E;
import SecondPackage.F;

public class Main {

    public static void main(String[] args) {

        //public inside package
	    A a = new A();
        System.out.println(a.x);
        a.classMethod();

        //public outside package
        B b = new B();
        System.out.println(b.x);
        b.classMethod();

        //private inside package
        C c = new C();
       // System.out.println(c.x); // Error!
        //c.classMethod();  // Error!

        // getting the private Variable from public method...  mohaha
        c.PublicMethodInC();

        //Default inside package
        D d = new D();
        System.out.println(d.x);
        d.classMethod();

        //Default outside package
        E e = new E();
        //System.out.println(e.x); // Error;
        //e.classMethod(); // Error;

        //getting protected without subclass
        F f = new F();
        System.out.println(f.x);
        f.classMethod();

        //getting protected from subclass
        G g = new G();
        g.gclassMethod();



    }
}
