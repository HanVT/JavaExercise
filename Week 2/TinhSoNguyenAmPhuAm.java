import java.util.Locale;
import java.util.Scanner;

public class TinhSoNguyenAmPhuAm{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String chuoi;
        int nguyenam=0,phuam=0;
        System.out.println("Nhập chuỗi: ");
        chuoi = sc.nextLine();
        for (int i=0;i<chuoi.length();i++)
        {
            if ((chuoi.toLowerCase(Locale.ROOT).charAt(i)=='u')|| (chuoi.toLowerCase(Locale.ROOT).charAt(i)=='o')|| (chuoi.toLowerCase(Locale.ROOT).charAt(i)=='e')|| (chuoi.toLowerCase(Locale.ROOT).charAt(i)=='a')|| (chuoi.toLowerCase(Locale.ROOT).charAt(i)=='i'))
            {
                nguyenam++;
            }
            else phuam++;
        }
        System.out.println("Số nguyên âm: "+nguyenam);
        System.out.println("Số phụ âm: "+phuam);
    }
}