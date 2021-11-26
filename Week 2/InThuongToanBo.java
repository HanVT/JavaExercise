import java.util.Scanner;

public class InThuongToanBo {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String chuoi;
        System.out.println("Nhập chuỗi: ");
        chuoi=sc.nextLine();
        chuoi=chuoi.toLowerCase();
        System.out.println("Chuỗi sau khi in hoa chu dau: "+chuoi);
    }
}
