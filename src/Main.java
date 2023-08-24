import java.util.Scanner;

public class Main {
    public static void main(String[]arg){
        double tutar;

        Scanner input = new Scanner(System.in);
        System.out.print("Ucret Tutarini Giriniz: ");
        tutar = input.nextDouble();

        double kdvOrani = tutar <= 1000 ? 0.18 : 0.08;
        double kdvTutari = tutar * kdvOrani;

        System.out.println("KDV Tutarı: " + kdvTutari);

    }
}