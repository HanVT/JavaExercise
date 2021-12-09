import java.util.Scanner;
class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("\n\nNhập vào số cần làm tròn: ");
        double num = sc.nextDouble();

        System.out.format("Số %f sau khi được làm tròn: %.3f",num,num);

    }
}