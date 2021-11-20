package com.sriram;

public class Temporary {
    public static void main(String[] args) {
        int p=8,q=7,r=4;
        for (r = 5 ; r <=9; r++) {
            p=(r+6)+r;
            if((p+9) > (q-p)) {
                System.out.println("Inside the if");
                continue;
            }
            else {
                p=(3+10)+p;
                r=6&q;
            }
        }
        System.out.print("Moved out of the for");
        System.out.println(p+q);


        // int p=0,q=6,r=7;
        //        for (int i = 4 ; i <=7; i++) {
        //            p=(r&1)+p;
        //            if((p-r+q) > (q-p)) {
        //                System.out.println("Inside the if");
        //                p=(8+5)+p;
        //                p=(q+q)+p;
        //            }
        //            else {
        //                p=(p+p)+p;
        //            }
        //        }
        //        System.out.print("Moved out of the for");
        //        System.out.println(p+q);

    }
}
