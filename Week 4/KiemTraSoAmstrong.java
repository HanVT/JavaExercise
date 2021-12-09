import java.util.Scanner;

public class KiemTraSoAmstrong {
    public static boolean checkamstrong(int n)
    {
        int temp=n;
        int sum=0;
        while (temp!=0) {
            sum+=(temp%10)*(temp%10)*(temp%10);
            temp/=10;
        }
        if (sum==n) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void main (String[] Args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap so nguyen duong n: ");
        try {
            int n = sc.nextInt();
            if (n < 0) {
                System.out.println("So vua nhap khong thoa so nguyen duong");
            } else {
                if (checkamstrong(n)) {
                    System.out.println("So vua nhap la so Amstrong");
                }
                else {
                    System.out.println("So vua nhap khong phai la so Amstrong");
                }
            }
        }
        catch (Exception e) {
            System.out.println("Input sai");
        }
    }
}
