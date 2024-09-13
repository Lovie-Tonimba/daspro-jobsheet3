import java.util.Scanner;
public class Kafe10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean membership;
        int jmlKopi, jmlTeh, jmlRoti;
        double hargaKopi = 12000.0, hargaTeh = 7000.0, hargaRoti = 20000.0;
        float diskon = 10 / 100f;
        double totalHarga;
        double nominalBayar;

        System.out.println("Enter membership (true/false): ");
        membership = sc.nextBoolean();
        System.out.println("Enter jumlah pembelian kopi: ");
        jmlKopi = sc.nextInt();
        System.out.println("Enter jumlah pembelian teh: ");
        jmlTeh = sc.nextInt();
        System.out.println("Enter jumlah pembelian roti: ");
        jmlRoti = sc.nextInt();

        totalHarga = (jmlKopi * hargaKopi) + (jmlTeh * hargaTeh) + (jmlRoti * hargaRoti);
        nominalBayar = totalHarga - (diskon * totalHarga);

        System.out.println("Membership customers " + membership);
        System.out.println("Item pembelian " + jmlKopi + " Kopi, " + jmlTeh + "Teh, " + jmlRoti + "Roti");
        System.out.println("Nominal bayar Rp " + nominalBayar);

    }
}
