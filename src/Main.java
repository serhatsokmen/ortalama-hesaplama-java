
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int mat, fizik, kimya, turkce, tarih, muzik;

        System.out.println("Matematik notunu giriniz : ");
        mat = scan.nextInt();

        System.out.println("Fizik notunu giriniz : ");
        fizik = scan.nextInt();

        System.out.println("kimya notunu giriniz");
        kimya = scan.nextInt();

        System.out.println("turkce notunu giriniz : ");
        turkce = scan.nextInt();

        System.out.println("tarih notunu giriniz : ");
        tarih = scan.nextInt();

        System.out.println("muzik notunu giriniz : ");
        muzik = scan.nextInt();

        double ortalama = (mat+fizik+kimya+turkce+tarih+muzik)/6;
        System.out.println("not ortalamaniz : "+ortalama);

        if(ortalama >= 60)
            System.out.println("Gectiniz, tebrikler.");
        else
            System.out.println("maalesef kaldiniz.");

    }
}