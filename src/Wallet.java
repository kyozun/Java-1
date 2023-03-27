public class Wallet {
    private static final StringBuilder sb = new StringBuilder();

    private int soTienTrongVi;

    public void getWallet(int soTienTrongVi) {
        this.soTienTrongVi = soTienTrongVi;
    }

    public boolean canPayMoney(int soTienHoaDon) {
        if (soTienHoaDon > soTienTrongVi) {
            System.out.println("============================");
            System.out.println("Ban khong du tien de thanh toan!");
            return false;
        } else {
            this.soTienTrongVi -= soTienHoaDon;
            System.out.println("============================");
            System.out.println("Ban da thanh toan thanh cong!");
            System.out.println("So tien con lai trong vi la: " + this.soTienTrongVi);
            return true;
        }
    }

    public void depositMoney(int soTienNapVao) {
        this.soTienTrongVi += soTienNapVao;
        System.out.println("So tien trong vi la: " + soTienTrongVi);
    }

}
