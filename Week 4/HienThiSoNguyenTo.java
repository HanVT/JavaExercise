import java.util.Scanner;

public class HienThiSoNguyenTo {
    public static boolean kiemtrasonguyento(int n)
    {
        for (int i=2;i<n;i++)
        {
            if (n%i==0) return false;
        }
        return true;
    }
    public static void  main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập n: ");
        try {
            int n=sc.nextInt();
            System.out.println("Các số nguyên tố từ 0 đến "+n);
            for (int i=2;i<n;i++)
            {
                if (kiemtrasonguyento(i)) {
                    System.out.print(i+" ");
                }
            }
        }
        catch (Exception e) { System.out.print("Số vừa nhập sai"); }

    }
}
