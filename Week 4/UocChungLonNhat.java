import java.util.Scanner;

public class UocChungLonNhat {
    public static void  main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập a, b: ");
        try {
            int a=(sc.nextInt());
            int b=sc.nextInt();
            int temp=b;
            if (a>b) {temp=b;}
            while ((temp%a!=0)||(temp%b!=0)) {
                temp++;
            }
            System.out.print("UCLN: "+temp);
        }
        catch (Exception e) {
            System.out.print("Nhập sai input");
        }
    }
}
