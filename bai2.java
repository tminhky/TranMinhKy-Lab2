package Lab2;
import java.util.Scanner;
    public class bai2
{
     public static void main(String[] args)
    {
        float a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a: "); a = sc.nextFloat();
        System.out.println("Nhap b: "); b = sc.nextFloat();
        System.out.println("Nhap c: "); c = sc.nextFloat();

        if (a == 0)
        {
            if(b == 0)
            {
                if(c == 0 ) {System.out.println("Phuong trinh vo so nghiem");}
                else        {System.out.println("Phuong trinh vo nghiem");}
            }
            else
            {
                float x = - c / a;
                System.out.println("Phuong trinh co 1 nghiem duy nhat la: " + x);
            }
        }
        else
        {
            float delta = (b * b) - (4 * a * c);
            float candelta =   (float) Math.sqrt(delta);
                if(delta < 0 ) { System.out.println("Phuong trinh vo nghiem");}
                else if(delta == 0 )  
                {
                    float x = -b / (2 * a);
                    System.out.println("phuong trinh co nghiem kep: " + x);
                }
                else
                {
                   float x1 = ( -b + candelta) / (2 * a);
                   float x2 = ( -b - candelta) / (2 * a);
                   System.out.println("Phuong trinh co 2 nghiem phan biet la: ");
                   System.out.println("x1=: "+ x1);
                   System.out.println("x2=: "+ x2);
                }
        }
    }
}
