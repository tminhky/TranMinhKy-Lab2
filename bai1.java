package Lab2;
import java.util.Scanner;

public class bai1 {
    public static void baitap1(float a, float b)
    {
    if (a == 0)
     {
        if(b == 0)
        {
            System.out.println("pt vo so nghiem");
        }
        else
        {
            System.out.println("pt vo nghiem");
        }
    }
        else 
        {
           float x= -b / a;
            System.out.println("nghiem la : " + x);

        }
}
public static void main(String[] args)
{
    float a,b;
    Scanner sc = new Scanner(System.in); {
        {
        System.out.print("nhap a: ");
        a= sc.nextFloat();
        System.out.print("nhap b: ");
        b= sc.nextFloat();
        baitap1(a,b);
        }
    }
}
}
