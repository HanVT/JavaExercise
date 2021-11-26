import java.util.Scanner;

public class InHoaToanBo {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String chuoi;
        System.out.println("Nhập chuỗi: ");
        chuoi=sc.nextLine();
        chuoi=chuoi.toUpperCase();
        System.out.println("Chuỗi sau khi in hoa chu dau: "+chuoi);
    }
}
