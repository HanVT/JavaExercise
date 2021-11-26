import java.util.Scanner;
public class KiemTraNguyenAmScanner {
    public static void main(String[] args)
    {
        char a;
        boolean check=false;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập 1 chữ: ");
        a=sc.next().charAt(0);
        sc.close();
        switch (a)
        {
            case 'u': case 'U': case 'e': case 'E': case 'o': case 'O': case 'a': case 'A': case 'i': case 'I': check=true;
        }
        if (check==true&&((a>='a'&&a<='z')||(a>='A'&&a<='Z'))) {System.out.println("Chữ vừa nhập là nguyên âm");}
        else if ((a>='a'&&a<='z')||(a>='A'&&a<='Z')) {System.out.println("Chữ vừa nhập không phải là nguyên âm");}
        else {System.out.println("Chữ không có trong bảng chữ cái");}
    }
}
