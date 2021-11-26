import java.util.Scanner;
public class XoaKhoangTrangChuoiJava {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String chuoi;
        System.out.println("Nhap vao mot chuoi bat ky: ");
        chuoi=sc.nextLine();
        chuoi=chuoi.replaceAll(" ","");
        System.out.println(chuoi);
    }
}
