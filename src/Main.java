import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double armutKg, elmaKg, domatesKg, muzKg, patlıcanKg;
        double toplamTutar;

        double armutTL = 2.14d, elmaTL = 3.67d, domatesTL = 1.11d, muzTL = 0.95d, patlıcanTL = 5.0d;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo ? :");
        armutKg = scanner.nextDouble();

        System.out.print("Elma Kaç Kilo ? :");
        elmaKg = scanner.nextDouble();

        System.out.print("Domates Kaç Kilo ? :");
        domatesKg = scanner.nextDouble();

        System.out.print("Muz Kaç Kilo ? :");
        muzKg = scanner.nextDouble();

        System.out.print("Patlıcan Kaç Kilo ? :");
        patlıcanKg = scanner.nextDouble();

        toplamTutar = armutKg * armutTL + elmaKg * elmaTL + domatesKg * domatesTL + muzKg * muzTL + patlıcanKg * patlıcanTL;

        System.out.println("Toplam Tutar : " + toplamTutar + " TL");

    }
}
