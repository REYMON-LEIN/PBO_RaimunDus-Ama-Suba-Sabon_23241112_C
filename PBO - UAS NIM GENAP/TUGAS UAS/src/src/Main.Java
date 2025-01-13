import java.util.Scanner;

class Pelanggan {
    private double potongan;

    public double hitungPotongan(boolean memilikiMember, double totalBelanja) {
        if (memilikiMember) {
            if (totalBelanja > 500000) {
                potongan = 0.10;
            } else if (totalBelanja >= 100000) {
                potongan = 0.05;
            } else {
                potongan = 0.03;
            }
        } else {
            if (totalBelanja > 100000) {
                potongan = 0.03;
            } else {
                potongan = 0.0;
            }
        }
        return potongan;
    }

    public double hitungTotalSetelahPotongan(double totalBelanja, double potongan) {
        return totalBelanja - (totalBelanja * potongan);
    }
}

public class NIAGA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama pelanggan: ");
        String namaPelanggan = scanner.nextLine();

        System.out.print("Apakah pelanggan memiliki kartu member? (ya/tidak): ");
        String statusMemberInput = scanner.nextLine();
        boolean memilikiMember = statusMemberInput.equalsIgnoreCase("ya");

        System.out.print("Masukkan total belanja: ");
        double totalBelanja = scanner.nextDouble();

        Pelanggan pelanggan = new Pelanggan();
        double potongan = pelanggan.hitungPotongan(memilikiMember, totalBelanja);
        double totalSetelahPotongan = pelanggan.hitungTotalSetelahPotongan(totalBelanja, potongan);
        double jumlahDiskon = totalBelanja * potongan;

        System.out.println("\n===== Rincian Belanja =====");
        System.out.println("Nama Pelanggan: " + namaPelanggan);
        System.out.println("Status Member: " + (memilikiMember ? "Ya" : "Tidak"));
        System.out.println("Total Belanja Sebelum Potongan: Rp " + String.format("%.2f", totalBelanja));
        System.out.println("Diskon: " + (int)(potongan * 100) + "%");
        System.out.println("Jumlah Diskon: Rp " + String.format("%.2f", jumlahDiskon));
        System.out.println("Total Belanja Setelah Potongan: Rp " + String.format("%.2f", totalSetelahPotongan));

        scanner.close();
    }
}