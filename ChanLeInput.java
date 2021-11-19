// if {} else {}
import java.util.Scanner;
public class ChanLeInput {
    public static void main(String[] args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập số: ");
        n=sc.nextInt();
        if (n%2>0)
        {
            System.out.println("Số "+n+" là số lẻ");

        }
        else System.out.println("Số "+ n+" là số chẵn");
    }
}
