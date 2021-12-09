import java.util.Scanner;

public class KiemTraAmDuong {
    public static boolean checkamduong(int n)
    {
        if (n>0) return true;
        else return false;

        }
    public static void main(String[] Args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập n: ");
        try{
            int n=sc.nextInt();
            if (checkamduong(n)) {
                System.out.println("Số vừa nhập là số nguyên dương");

            }
            else {
                System.out.println("Số vừa nhập là số nguyên âm");
            }
        }
        catch (Exception e) {
            System.out.println("Input không hợp lệ");
        }

    }
}

