package com.practise.java.interview.co;

public class ContractEmployee implements EmployeeCO{
    int salary = 20000;
    int bonus = 5;
    @Override
    public int salary() {
        return salary;
    }

    public int salary(int bonus){
        return 0;
    }
}
