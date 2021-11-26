import java.util.Scanner;
public class ChuoiDao {
    public static void main(String[] args)
    {
        String chuoi;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap chuoi: ");
        chuoi=sc.nextLine();
        String chuoidao="";
        for (int i=chuoi.length()-1;i>=0;i--)
        {
            chuoidao=chuoidao+chuoi.charAt(i);
        }
        System.out.println("Chuoi dao: " + chuoidao);
    }
}
