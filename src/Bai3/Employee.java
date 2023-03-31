package Bai3;
import java.util.Scanner;

public class Employee extends Staff{
    @Override
    public void inputData() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập tên: ");
        this.name = input.nextLine();
    }

    public void displayData() {
        System.out.println("Tên của bạn là: " + this.name);
    }

    @Override
    public int getSalary() {
        return this.salary;
    }

}
