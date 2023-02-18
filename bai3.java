package Lab2;
import java.util.Scanner;

public class bai3 {
    public static void main(String[] args)
    {
        int soDien, tien;
        Scanner s = new Scanner(System.in); {
            {
            System.out.print("nhap vao so dien: ");
            soDien = s.nextInt();
            }
        }
        if (soDien < 50)
        {
            tien = soDien * 1000;
        }
        else
        {
            tien = 50 * 1000 + (soDien - 50)*1200;
        }
        System.out.println("so tien phai tra la: " + tien + "VND");
    }
}
