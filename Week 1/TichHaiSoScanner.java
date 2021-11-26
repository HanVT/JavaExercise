import java.util.Scanner;

public class TichHaiSoScanner {


        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.print("nhập vào số thứ nhất: ");

            double num1 = scan.nextDouble();

            System.out.print("Nhập vào số thứ hai:  ");
            double num2 = scan.nextDouble();

            double tich = num1*num2;

            System.out.println("Kết quả: "+tich);
        }
    }

