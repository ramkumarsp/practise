package com.learning.java.collection;

import java.util.*;

public class SynchronizedSetException {
    public static void main(String[] args) {
        final Set<String> synchronizedSet = Collections.synchronizedSet(new LinkedHashSet<String>());
        synchronizedSet.add("A");
        synchronizedSet.add("B");
        synchronizedSet.add("F");
        synchronizedSet.add("C");
        new Thread() {
            @Override
            public void run() {
//                for (String str : synchronizedSet) {
//                    System.out.println(str);
//                    synchronizedSet.add("E");
//                    synchronizedSet.add("D");
//                    try {
//                        Thread.sleep(100);
//                    }
//                    catch (Exception e) {
//                        e.printStackTrace();
//                    }
//                }
                ListIterator<String> stringIterator = (ListIterator<String>) synchronizedSet.iterator();
                while(stringIterator.hasNext()) {
                    System.out.println(stringIterator.next());
//                    synchronizedSet.add("E");
//                    synchronizedSet.add("D");
                    try {
                        Thread.sleep(100);
                    }
                    catch (Exception e) {
                        e.printStackTrace();
                    }
                }

//                System.out.println("Next");
//                Iterator<String> stringIterator1 = synchronizedSet.iterator();
//                for(stringIterator1.hasNext()) {
//                    System.out.println(stringIterator1.next());
//                }
            }
        }.start();
    }
}
