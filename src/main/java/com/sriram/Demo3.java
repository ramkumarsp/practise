package com.sriram;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Demo3 {
    public static void main(String[] args) {
        Demo3 d = new Demo3();
        d.start();


//        int var1 = 101;
//        int var2 = 159;
//        if((var2 = 5) == var1)
//            System.out.println(var2);
//        else System.out.println(++var2);


//        String obj = "I LIKE AV";
//        System.out.println(obj.length());


//        Map<Integer, String> m = new TreeMap<Integer, String>();
//        m.put((int) 25.5, "DOT");
//        m.put(null,null);
//        m.put(11,"BMW");
//        m.put(null,"fer");
//        System.out.println(m.size());
//        System.out.println(m);
    }

    public static int sum(List list) {
        int sum=0;
        for(Iterator iter = list.iterator();
            iter.hasNext();
        )
        {
            int i = ((Integer)iter.next()).intValue();
            sum+=i;
        }
        return sum;
    }

    void start(){
        long ar1[] = {3,8,2};
        long ar2[]=method(ar1);
        System.out.println(ar1[0]+ar1[1]+ar1[2]+" ");
        System.out.println(ar2[0]+ar2[1]+ar2[2]+" ");
    }

    long[] method(long[] a3){
        a3[3] = 3;
        return a3;
    }
}
