
import java.util.Scanner;

public class Slide35 {
    public static void main(String[] args){
     
     int[] soNguyen;
     int n;
     int min = 0;
     Scanner sc = new Scanner(System.in);
     System.out.println(" Nhap vao so n:");
     n = sc.nextInt();
     soNguyen = new int[n];
     for(int i = 0; i < n; i++)
     {
        System.out.println("Nhap vao so nguyen:");
        soNguyen[i] = sc.nextInt();
     } 
     min = soNguyen[0];
     for(int i = 0; i < n; i++)
     {
        if(soNguyen[i] < min)
        min = soNguyen[i];

     }


System.out.println("phan tu co gia tri nho nhat la" + min);

    }
    
}
