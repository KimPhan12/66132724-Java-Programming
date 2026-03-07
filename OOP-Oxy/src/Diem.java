public class Diem {
    private double x;
    private double y;
    public Diem() {
        this.x = 0;
        this.y = 0;
    }
    public Diem(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double tinhKhoangCach(Diem d) {
        return Math.sqrt(Math.pow(this.x - d.x, 2) +
                         Math.pow(this.y - d.y, 2));
    }
    public boolean kiemTraTrungNhau(Diem d) {
        return this.x == d.x && this.y == d.y;
    }
    public Diem doiXungQuaGoc() {
        return new Diem(-this.x, -this.y);
    }
    public void tostring() {
        System.out.println("(" + x + ", " + y + ")");
    }
    public static void main(String[] args) {
        Diem A = new Diem(3, 4);
        Diem B = new Diem(1, 2);
        System.out.println("Khoang cach: " + A.tinhKhoangCach(B));
        if (A.kiemTraTrungNhau(B)) {
            System.out.println("Hai diem trung nhau");
        } else {
            System.out.println("Hai diem khong trung nhau");
        }
        Diem C = A.doiXungQuaGoc();
        System.out.print("Diem doi xung cua A: ");
        C.tostring();
    }
}