//boolean <biến>; :Biến bool
import java.util.Scanner;
public class KiemTraNamNhuanScanner {
    public static void main(String[] args)
    {
        int nam;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập năm: ");
        nam=sc.nextInt();
        boolean check;
        if (nam%4==0)
        {
            if (nam%100==0) {check=false;}
            else {check=true;}
        }
        else
        {
            check=false;
        }
        if (check==true) {System.out.println(nam+" là năm nhuận");}
        else {System.out.println(nam+ " là năm thường");}
    }
}
