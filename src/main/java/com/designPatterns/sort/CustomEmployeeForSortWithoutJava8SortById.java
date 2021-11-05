package com.designPatterns.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CustomEmployeeForSortWithoutJava8SortById {
    public static void main(String[] args) {
        List<EmployeeForSortWithoutJava8> emps = new ArrayList<EmployeeForSortWithoutJava8>();

        emps.add(new EmployeeForSortWithoutJava8(2001, "Modi", 55));
        emps.add(new EmployeeForSortWithoutJava8(1901, "Trumph", 57));
        emps.add(new EmployeeForSortWithoutJava8(1901, "Clinten", 57));
        emps.add(new EmployeeForSortWithoutJava8(1950, "Boris Johnson", 56));

        System.out.println("Before sorting custom list of EmployeeForSortWithoutJava8s : ");
        Iterator<EmployeeForSortWithoutJava8> it = emps.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        Collections.sort(emps);

        System.out.println("After sorting custom list of EmployeeForSortWithoutJava8s in ascending order: ");
        it = emps.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        Collections.sort(emps, Collections.reverseOrder());

        System.out.println("After sorting custom list of EmployeeForSortWithoutJava8s in descending order: ");
        it = emps.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
