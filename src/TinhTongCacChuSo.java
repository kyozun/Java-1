import java.util.Scanner;

public class TinhTongCacChuSo {
    public static void main(String[] args) {
        System.out.println("Nhap so nguyen n: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int sum = 0;

        while (n!=0) {
            sum += n%10;
            n /= 10;
        }

        System.out.println("Tong cac chu so la: " + sum);
    }
}
