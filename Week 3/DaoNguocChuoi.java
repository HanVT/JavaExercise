import java.util.Scanner;

public class DaoNguocChuoi {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhập số lượng phần tử: ");
        try
        {
            n=sc.nextInt();
            float total=0;
            float a[]=new float[n];
            for (int i=0;i<n;i++)
            {
                System.out.println("Nhập số thứ "+(i+1));
                a[i]=sc.nextFloat();
                total+=a[i];
            }
            float temp;
            for (int i=0;i<(n/2);i++)
            {
                temp=a[i];
                a[i]=a[n-1-i];
                a[n-1-i]=temp;
            }
            System.out.println("Chuoi đảo:");
            for (int i=0;i<n;i++)
            {
                System.out.println(a[i]);

            }
            System.out.println("Tong: "+total);
        }
        catch (Exception e)
        {
            System.out.println("Nhập sai");
        }
    }
}
