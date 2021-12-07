import java.util.Scanner;

public class HoanDoiHaiSo {
    public static void main(String[] args)
    {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập a,b: ");
        a=sc.nextInt();
        b=sc.nextInt();
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("a="+a+" b="+b);
    }
}
