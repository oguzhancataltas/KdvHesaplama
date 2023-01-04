import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int price;

        System.out.print("Fiyat giriniz : ");
        price = input.nextInt();

        double kdv = price * 0.18;

        double total = price + kdv;

        System.out.println("Toplam Tutarınız : " + total);
        System.out.print("KDV Tutarı : " + kdv);

    }
}
