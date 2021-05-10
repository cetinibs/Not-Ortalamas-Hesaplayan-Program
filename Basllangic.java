package Giris;
import java.util.Scanner;
import java.io.Console;

public class Basllangic {
    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            int mat, fizik, kimya, turkce, tarih, muzik;
            double sonuc;
            System.out.print("Matematik notunu giriniz : ");
            mat = input.nextInt();

            System.out.print("Fizik notunu giriniz : ");
            fizik = input.nextInt();

            System.out.print("Kimya notunu giriniz : ");
            kimya = input.nextInt();

            System.out.print("Türkçe notunu giriniz : ");
            turkce = input.nextInt();

            System.out.print("Tarih notunu giriniz : ");
            tarih = input.nextInt();

            System.out.print("Müzik notunu giriniz : ");
            muzik = input.nextInt();

            sonuc=(mat+fizik+kimya+turkce+tarih+muzik)/6;



            System.out.print("Sınıfı Geçti:"+(sonuc>60));

            System.out.print("Sınıfta Kaldı:"+(sonuc<60));
60

        }
}
