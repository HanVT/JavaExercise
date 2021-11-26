import java.util.Scanner;

public class SapXepChuoiAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String temp;
        int sochuoi;
        System.out.println("Nhập so chuỗi: ");
        try
        {
            Scanner scstring = new Scanner(System.in);
            sochuoi = sc.nextInt();
            String chuoi[]=new String[sochuoi];
            for (int i=0;i<sochuoi;i++)
            {

                System.out.println("Nhap chuoi thu "+(i+1)+" : ");
                chuoi[i]=scstring.nextLine();
            }
            for (int i=0;i<sochuoi;i++)
                for (int j=i+1;j<sochuoi;j++)
                {
                    if (chuoi[i].compareTo(chuoi[j]) >0)
                    {
                        temp=chuoi[i];
                        chuoi[i]=chuoi[j];
                        chuoi[j]=temp;
                    }
                }
            System.out.println("Chuoi sau khi sap xep: ");
                for (int i=0;i<sochuoi;i++) {System.out.println(chuoi[i]);}

        } catch (Exception e)
        {
            System.out.println("Loi nhap");
        }
    }
}
