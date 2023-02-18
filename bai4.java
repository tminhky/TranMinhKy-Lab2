package Lab2;
import java.util.Scanner;

public class bai4 {
    public static void menu(){
        System.out.println("+--------------------------------------+");
        System.out.println("1. Giai pt bac nhat");
        System.out.println("2. Giai pt bac hai");
        System.out.println("3. Tinh tien dien");
        System.out.println("Thoat");
        System.out.println("+--------------------------------------+");
        System.out.println("Moi ban chon: ");
        Scanner s = new Scanner(System.in); {
            int chon = s.nextInt();
            switch(chon)
            {
case 1 :
bai1.main(null);;
break;
case 2:
bai2.main(null);;
break;
case 3:
bai3.main(null);
break;
case 4: break;
default:
System.out.println("Nhap khong chinh xac");
            }
        }
    }
    public static void main(String[] args){
        menu();
    }
}
