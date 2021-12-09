import java.util.Scanner;

public class LietKeAmstrong {
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
    public static void main(String[] Args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap khoang tim so amstrong: ");
        try {
            int a=sc.nextInt();
            int b=sc.nextInt();
            for (int i=a;i<=b;i++)
            {
                if (checkamstrong(i)) {
                    System.out.print(i+ " ");
                }
            }
        }
        catch (Exception e) {
            System.out.println("Nhập sai");
        }
    }
}
