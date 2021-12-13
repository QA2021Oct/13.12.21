package com.company;

import SecondPackage.F;

public class G extends F {

    public void gclassMethod(){
        G g = new G();
        System.out.println(g.x);
        g.classMethod();
    }
}
