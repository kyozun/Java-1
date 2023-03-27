package Bai3;

import java.util.Scanner;

public class Staff {
    private String name;
    private String email;
    private int salary;

//    Staff(String name, String email, int salary) {
//        this.name = name;
//        this.email = email;
//        this.salary = salary;
//    }

    public void inputData() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập tên: ");
        this.name = input.nextLine();
    }

    public void displayData() {
        System.out.print("Tên của bạn là: " + this.name);
    }

    public void getSalary() {
        System.out.println("Lương của bạn là: " + this.salary);
    }


}
