package Bai3;
import java.util.Scanner;

public class Employee extends Staff{

    public void inputData() {
        super.inputData();
    }

    public void displayData() {
        super.displayData();
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.inputData();
        employee.displayData();
    }

}
