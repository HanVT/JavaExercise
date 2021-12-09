import java.util.Scanner;

public class UocCuaMotSo {
    public static void main(String[] Args)
    {
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập số: ");
        try
        {
            a=sc.nextInt();
            System.out.print("Các ước của số vừa nhập: ");
            for (int i=1;i<=a;i++)
            {
                if (a%i==0) {
                    System.out.print(i+" ");
                }
            }
        }
        catch (Exception e) {System.out.print("Input sai");}
    }
}
