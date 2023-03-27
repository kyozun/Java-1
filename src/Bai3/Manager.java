package Bai3;
import java.util.Scanner;

public class Manager extends Staff {
    private String stringDepartment = "";

    public void inputData() {
       super.inputData();
    }

    public void displayData() {
       super.displayData();
    }

    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.inputData();
        manager.displayData();
    }

}
