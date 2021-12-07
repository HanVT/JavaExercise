import java.util.Scanner;

public class SoHoanHao {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Nhập n: ");
        try {

            n=sc.nextInt();
            int temp=1;
            int total=0;
            while (temp<n)
            {
                if (n%temp==0) {total+=temp;}
                temp++;
            }
            System.out.println(total);
            if (total==n ) {
                System.out.println("Số vừa nhập là số hoàn hảo");
            }
            else {
                System.out.println("Số vừa nhập không phải là số hoàn hảo");
            }
        }

        catch (Exception e) {
            System.out.println("Input không hợp lệ");
        }
    }
}
