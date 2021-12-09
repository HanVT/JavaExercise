import java.util.Scanner;

public class KiemTraSoChinhPhuong {
    static boolean checksochinhphuong(int n){
        double sq=Math.sqrt(n);
        return sq-Math.floor(n)==0;
    }
    public static void  main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập n");
        try {
            int n=(sc.nextInt());
            if (checksochinhphuong(n))
            {
                System.out.print("Số vừa nhập là số chính phương");
            }
            else {
                System.out.print("Số vừa nhập không phải là số chính phương");
            }
        }
        catch (Exception e) {
            System.out.print("Nhập sai input");
        }
    }
}
