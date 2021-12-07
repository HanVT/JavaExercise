import java.util.Scanner;

public class DaoNguocMotSo {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a;
        try
        {
            System.out.println("Nhap so nguyen: ");
            a=sc.nextInt();
            int n=a;
            int reverse=0;
            while (n!=0)
            {
                reverse=reverse*10+(n%10);
                n/=10;
            }
            System.out.println("So dao nguoc: "+reverse);
        }
        catch (Exception e) {System.out.println("Input khong phai la so nguyen");}


    }
}
