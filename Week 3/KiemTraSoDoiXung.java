import java.util.Scanner;

public class KiemTraSoDoiXung {
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
            if (reverse==a) {System.out.println("So vua nhap la so doi xung"); }
            else {
                System.out.println("So vua nhap khong phai la so doi xung");
            }
        }
        catch (Exception e) {System.out.println("Input khong phai la so nguyen");}
    }
}
