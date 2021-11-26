import java.util.Scanner;
import java.util.Stack;
public class DoiXungStack {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String chuoi;
        System.out.println("Nhập chuỗi: ");
        chuoi=sc.nextLine();
        Stack stk=new Stack();
        for (int i=0;i<chuoi.length();i++)
        {
            stk.push(chuoi.charAt(i));
        }
        String reverse="";
        while (!stk.isEmpty())
        {
            reverse+=stk.pop();
        }
        System.out.println("Chuoi dao nguoc: "+reverse);
        if (chuoi.equals(reverse))
        {
            System.out.println("Chuoi vua nhap la chuoi doi xung");

        }
        else
        {
            System.out.println("Chuoi vua nhap khong phai la chuoi doi xung");
        }
    }
}
