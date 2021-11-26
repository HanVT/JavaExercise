import java.util.Scanner;

public class inhoakytudau {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String chuoi;
        System.out.println("Nhập chuỗi: ");
        chuoi=sc.nextLine();
        String firstchar=chuoi.substring(0,1);
        String otherchar=chuoi.substring(1, chuoi.length());
        firstchar=firstchar.toUpperCase();
        chuoi=firstchar+otherchar;
        System.out.println("Chuỗi sau khi in hoa chu dau: "+chuoi);
    }
}
