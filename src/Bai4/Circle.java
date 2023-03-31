package Bai4;
import java.util.Scanner;

public class Circle extends Shape {
    private float bankinh;
    private float dienTichHinhTron;
    private float chuViHinhTron;

    @Override
    public void setDoDai() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập bán kính: ");
        this.bankinh = input.nextFloat();
    }

    @Override
    public void getArea() {
        dienTichHinhTron = (float) (Math.pow(this.bankinh,2)*Math.PI);
    }

    @Override
    public void getPerimeter() {
        chuViHinhTron = (float) (2*Math.PI* bankinh);
    }

    @Override
    public void printResult() {
        System.out.println("-- Hình tròn --");
        System.out.println("Bán kính: " + bankinh);
        System.out.println("Chu vi hình tròn là: " + chuViHinhTron);
        System.out.println("Diện tích hình tròn là: " + dienTichHinhTron);


    }


}
