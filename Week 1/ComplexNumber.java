// Tạo constructor


import jdk.nashorn.internal.ir.ReturnNode;
import java.util.Scanner;
public class ComplexNumber {
    double real,img; //R=real+img*i
    ComplexNumber(double x,double y)
    {
        this.real=x;
        this.img=y;
    }
    public static ComplexNumber sum(ComplexNumber a, ComplexNumber b)
    {
        ComplexNumber Sum= new ComplexNumber(0,0);
        Sum.real=a.real+b.real;
        Sum.img=a.img+b.img;
        return Sum;
    }
    public  static  void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double a1,b1,a2,b2;
        System.out.println("Nhập a1,b1 trong số phức R1=a1+b1*i:");
        a1= sc.nextDouble();
        b1=sc.nextDouble();
        System.out.println("Nhập a2,b2 trong số phức R2=a2+b2*i:");
        a2=sc.nextDouble();
        b2=sc.nextDouble();
        ComplexNumber r1=new ComplexNumber(a1,b1);
        ComplexNumber r2= new ComplexNumber(a2,b2);
        ComplexNumber sum=sum(r1,r2);
        System.out.println("Kết quả: "+sum.real+" + "+sum.img+"*i ");
    }
}
