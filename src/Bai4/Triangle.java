package Bai4;

import java.util.Scanner;

public class Triangle extends Shape {
    private float canhA;
    private float canhB;
    private float canhC;
    private float dienTichTamGiac;
    private float chuViTamGiac;

    @Override
    public void setDoDai() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập cạnh A: ");
        this.canhA = input.nextFloat();

        System.out.print("Nhập cạnh B: ");
        this.canhB = input.nextFloat();

        System.out.print("Nhập cạnh C: ");
        this.canhC = input.nextFloat();
    }

    @Override
    public void getArea() {
        dienTichTamGiac = (float) Math.sqrt((this.canhA + canhB + canhC) * (canhA + canhB - canhC) * (-canhA + canhB + canhC) * (canhA - canhB + canhC) / 2);
    }

    @Override
    public void getPerimeter() {
        chuViTamGiac = this.canhA + this.canhB + this.canhC;
    }

    @Override
    public void printResult() {
        System.out.println("-- Hình tam giác --");
        System.out.println("Cạnh A: " + canhA);
        System.out.println("Cạnh B: " + canhB);
        System.out.println("Cạnh C: " + canhC);
        System.out.println("Diện tích tam giác là: " + dienTichTamGiac);
        System.out.println("Chu vi của tam giác là: " + chuViTamGiac);
    }

}
