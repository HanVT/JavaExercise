import java.util.Scanner;

public class toString {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String chuoi;

        System.out.println("Nhập chuỗi: ");
        chuoi=sc.nextLine();
        int n=chuoi.length();
        char kytu[]=new char[n];
        for (int i=0;i<n;i++)
        {
            kytu[i]=chuoi.charAt(i);
            System.out.println("Ký tự thứ "+(i+1)+" là: "+kytu[i]);
        }

    }
}
