import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        int a[][], b[][];
        int r1, c1, r2, c2;
        Scanner sc = new Scanner(System.in);
        try {
        System.out.print("Nhập hàng và cột của matrix thứ nhất: ");
        r1 = sc.nextInt();
        c1 = sc.nextInt();
        System.out.print("Nhập hàng và cột của matrix thứ hai: ");
        r2 = sc.nextInt();
        c2 = sc.nextInt();

            if ((r1 == r2) && (c1 == c2)) {
                a = new int[r1][c1];
                b = new int[r2][c2];
                int sum[][] = new int[r1][c1];
                System.out.println("Nhap matrix a: ");
                for (int i = 0; i < r1; i++) {
                    for (int j = 0; j < c1; j++) {
                        a[i][j] = sc.nextInt();
                    }
                }
                System.out.println("Nhap matrix b: ");
                for (int i = 0; i < r1; i++) {
                    for (int j = 0; j < c1; j++) {
                        b[i][j] = sc.nextInt();
                    }
                }
                for (int i = 0; i < r1; i++) {
                    for (int j = 0; j < c1; j++) {
                        sum[i][j] = a[i][j] + b[i][j];
                    }
                }
                System.out.println("Tổng 2 matrix");
                for (int i = 0; i < r1; i++) {
                    for (int j = 0; j < c1; j++) {
                        System.out.print(sum[i][j] + "  ");
                    }
                    System.out.println();
                }
            } else {
                System.out.println("Lỗi số hàng cột của 2 ma trận không giống nhau");
            }
        }
        catch (Exception e) {System.out.println("Lỗi nhập số hàng, cột sai");}
    }
}
