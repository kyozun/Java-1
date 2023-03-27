import java.util.Scanner;
public class Student {
    protected String name;
    //Static property (Không cần khởi tạo đối tượng, static method ko thể truy cập vào property ko phải là static)
//    static int age;
    private int age;
    //Constructor
    Wallet wallet = new Wallet();

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void inputData() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        this.name = input.nextLine();
        System.out.println("Nhap tuoi: ");
        this.age = input.nextInt();
    }

    public void displayData() {
        System.out.println("Ten cua ban la: " + this.name);
        System.out.println("Tuoi cua ban la: " + this.age);
    }

    public void napTien() {
        System.out.println("Nhap so tien muon nap: ");
        Scanner input = new Scanner(System.in);
        int soTienMuonNap = input.nextInt();

        this.wallet.depositMoney(soTienMuonNap);

    }

    public void nhapHoaDon() {

        System.out.print("Nhap so luong hoa don: ");
        Scanner input = new Scanner(System.in);
        int soLuongHoaDon = input.nextInt();

        int soTienHoaDon = 0;
        for (int i=0; i<soLuongHoaDon; i++) {
            System.out.print("Nhap so tien cua hoa don thu " + (i+1) + ": ");
            soTienHoaDon += input.nextInt();
        }

        System.out.println("Tong so tien can phai thanh toan la: " + soTienHoaDon);

        System.out.print("Nhap so tien con lai trong vi: ");
        int soTienTrongVi = input.nextInt();

        this.wallet.getWallet(soTienTrongVi);
        this.wallet.canPayMoney(soTienHoaDon);
    }

}



