// Kelas induk (Superclass): BangunDatar
abstract class BangunDatar {
    // Metode abstrak untuk menghitung luas
    public abstract float luas();
    // Metode abstrak untuk menghitung keliling
    public abstract float keliling();
}

// Kelas turunan: Persegi
class Persegi extends BangunDatar {
    public float sisi;

    public Persegi(float sisi) {
        this.sisi = sisi;
    }

    @Override
    public float luas() {
        return sisi * sisi;
    }

    @Override
    public float keliling() {
        return 4 * sisi;
    }
}

// Kelas turunan: Lingkaran
class Lingkaran extends BangunDatar {
    public float r;

    public Lingkaran(float r) {
        this.r = r;
    }

    @Override
    public float luas() {
        return (float) (Math.PI * r * r);
    }

    @Override
    public float keliling() {
        return (float) (2 * Math.PI * r);
    }
}

// Kelas turunan: PersegiPanjang
class PersegiPanjang extends BangunDatar {
    public float panjang, lebar;

    public PersegiPanjang(float panjang, float lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public float luas() {
        return panjang * lebar;
    }

    @Override
    public float keliling() {
        return 2 * (panjang + lebar);
    }
}

// Kelas turunan: Segitiga
class Segitiga extends BangunDatar {
    public float alas, tinggi;

    public Segitiga(float alas, float tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public float luas() {
        return (alas * tinggi) / 2;
    }

    @Override
    public float keliling() {
        // Dummy value; as a general triangle requires all sides
        return alas + 2 * tinggi; // Contoh sederhana (segitiga siku-siku asumsi dua sisi sama)
    }
}

// Kelas Main: Untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        // Contoh objek bangun datar
        Persegi persegi = new Persegi(4);
        System.out.println("Luas Persegi: " + persegi.luas());
        System.out.println("Keliling Persegi: " + persegi.keliling());

        Lingkaran lingkaran = new Lingkaran(7);
        System.out.println("\nLuas Lingkaran: " + lingkaran.luas());
        System.out.println("Keliling Lingkaran: " + lingkaran.keliling());

        PersegiPanjang persegiPanjang = new PersegiPanjang(5, 3);
        System.out.println("\nLuas Persegi Panjang: " + persegiPanjang.luas());
        System.out.println("Keliling Persegi Panjang: " + persegiPanjang.keliling());

        Segitiga segitiga = new Segitiga(6, 4);
        System.out.println("\nLuas Segitiga: " + segitiga.luas());
        System.out.println("Keliling Segitiga: " + segitiga.keliling());
    }
}