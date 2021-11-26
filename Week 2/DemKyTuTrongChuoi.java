import java.util.Scanner;

public class DemKyTuTrongChuoi{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String chuoi;
        System.out.println("Nhập chuỗi: ");
        chuoi = sc.nextLine();
        int tempcheck;
        int diffcharcount = 0;
        char a[] = new char[chuoi.length()];
        int soluong[] = new int[chuoi.length()];

        for (int i = 0; i < chuoi.length(); i++) {
            tempcheck = 0;
            for (int j = 0; j < diffcharcount; j++) {
                if (a[j] == chuoi.charAt(i)) {
                    soluong[j]++;
                    tempcheck = 1;
                }

            }
            if (tempcheck == 0) {
                a[diffcharcount] = chuoi.charAt(i);
                soluong[diffcharcount] = 1;
                diffcharcount++;

            }

        }
        for (int i = 0; i < diffcharcount; i++) {

                System.out.println("Chữ " + a[i] + " xuất hiện " + soluong[i] + " lần.");


        }
    }
}