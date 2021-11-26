import java.util.Scanner;
public class TinhLaiKep {
    public void calculate(int p, int t, double r, int n) {
        double tongtien = p * Math.pow(1 + (r / n), n * t);
        double laikep = tongtien - p;
        System.out.println("Lãi kép sau " + t + " năm là : "+laikep);
        System.out.println("Số tiền có được sau " + t + " năm là: "+tongtien);
    }
    public static void main(String args[]) {
        TinhLaiKep kq = new TinhLaiKep();
        Scanner sc=new Scanner(System.in);
        int p,t,n;
        double r;
        System.out.println("Nhập số tiền gốc, thời gian đầu tư (năm), lãi suất, và số lãi cộng gộp: ");
        p=sc.nextInt();
        t=sc.nextInt();
        r=sc.nextDouble();
        n=sc.nextInt();

        kq.calculate(p,t,r,n);

    }
}