package Bai3;

import java.util.Scanner;

public abstract class Staff {
    public String name;
    public int salary;

    public abstract void inputData();
    public abstract void displayData();

    public abstract int getSalary();

    public void setSalary(int sal) {
        this.salary = sal;
    }


}
