package Bai4;

public class MainClass {
    public static void main(String[] args) {
        Shape shape[] = new Shape[2];

        shape[0] = new Triangle();
        shape[1] = new Circle();

        for (Shape item: shape) {
            item.setDoDai();
            item.getPerimeter();
            item.getArea();
            item.printResult();
        }
    }
}
