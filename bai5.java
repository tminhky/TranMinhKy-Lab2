import java.util.Scanner;
public class SoChinhPhuong {
   
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("nhap so: ");
    int  sochinhphuong = sc.nextInt();
    double canbac2 = Math.sqrt(sochinhphuong);
    if (canbac2*canbac2==sochinhphuong)
    {
        System.out.println("la so chinh phuong");
    }
    else
    {
        System.out.println(" khong la so chinh phuong");
    }
}
}

