package Bai3;

public class MainClass {
    public static void main(String[] args) {
        Staff staff[] = new Staff[2];

        staff[0] = new Employee();
        staff[1] = new Manager();

        staff[0].setSalary(3000);
        staff[1].setSalary(4000);

        for (Staff item:staff) {
            System.out.println("Lương của bạn là: " + item.getSalary());
        }
    }
}
