import java.util.Scanner;

public class BCNN {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("Nhập a,b:");
        a=sc.nextInt();
        b=sc.nextInt();
        int c=b;
        if (a>b) {c=a;}
        while ((c%a!=0)||(c%b!=0))
        {
            c++;
        }
        System.out.println("BCNN: "+c);
    }
}
