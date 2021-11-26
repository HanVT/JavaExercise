import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
public class DoiXungQueue {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String chuoi;
        System.out.println("Nhập chuỗi: ");
        chuoi=sc.nextLine();
        Queue stk=new LinkedList();
        for (int i=chuoi.length()-1;i>=0;i--)
        {
            stk.add(chuoi.charAt(i));
        }
        String reverse="";
        while (!stk.isEmpty())
        {
            reverse+=stk.remove();
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
