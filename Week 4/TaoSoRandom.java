import java.util.Random;
import java.util.Scanner;

public class TaoSoRandom {
    public static void main(String[] Args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap n: ");
        try {
            int n=sc.nextInt();
            Random r=new Random();
            System.out.println("Dãy "+n+" số random:");
            for (int i=0;i<n;i++)
            {
                System.out.println(r.nextInt(300));
            }
        }
        catch (Exception e) {
            System.out.println("Nhập sai số lượng n.");
        }
    }
}
