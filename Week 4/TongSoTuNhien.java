import java.util.Scanner;

public class TongSoTuNhien {
    public static void main(String[] Args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        try
        {
            System.out.print("Nhập số tự nhiên: ");
            n=sc.nextInt();
            int total=0;
            if (n>0)
            {
                for (int i = 0; i < n; i++)
                {
                    total += i;
                }
                System.out.print("Total: "+total);
            }
            else
            {
                System.out.print("Số nhập vào không phải số tự nhiên");
            }
        }
        catch (Exception e) {
            System.out.print("Số nhập vào không phải là số tự nhiên");
        }
    }
}
