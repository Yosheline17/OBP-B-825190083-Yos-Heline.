import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.print("Masukkan Nama Barang : ");
        String NamaBrg = in.nextLine();
        System.out.print("Jumlah Barang Yang dibeli : ");
        float JumlahBrg = in.nextFloat();
        System.out.print("Harga Barang Persatuan : Rp. ");
        float Harga = in.nextFloat();


        Perlengkapan perl = new Perlengkapan(Harga, JumlahBrg, NamaBrg);
        System.out.println("Total Harga: Rp. " + perl.getArea());
        System.out.println();


        System.out.println("Transaksi Pembayaran :");
        System.out.print("Masukkan jumlah saldo: Rp. ");
        float Saldo = in.nextFloat();
        System.out.print("Bayar berapa dulu : Rp. ");
        float Bayar = in.nextFloat();

        Pembayaran pemb = new Pembayaran(Saldo, Bayar);
        System.out.println("Sisa saldo anda: Rp. " + pemb.getPerimeter());
    }


}
