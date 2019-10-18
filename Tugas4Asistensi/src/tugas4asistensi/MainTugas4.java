package tugas4asistensi;

import java.util.Scanner;

/**
 *
 * @author tsamarahrana
 */
public class MainTugas4 {

    public static void main(String[] args) {
        System.out.println("Pilih bangun datar yang diinginkan : " + "\n1.Persegi" + "\n2.Lingkaran" + "\n3.Segitiga");
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan pilihan anda : ");
        int pilihan;
        pilihan = input.nextInt();
        
        switch (pilihan) {
            case 1:
                System.out.println("Masukkan panjang sisi : ");
                Persegi p = new Persegi();
                p.jenis = "Persegi";
                p.sisi = input.nextDouble();
                p.view();
                break;
            case 2:
                System.out.println("Masukan jari-jari : ");
                Lingkaran l = new Lingkaran();
                l.jenis = "Lingkaran";
                l.radius = input.nextDouble();
                l.view();
                break;
            case 3:
                System.out.println("Pilih segitiga yang diinginkan \n1.Segitiga siku-siku \n2.Segitiga sama sisi");
                System.out.println("Masukkan pilihan anda : ");
                int jenissegitiga = input.nextInt();
                JenisSegitiga js = new JenisSegitiga();
                System.out.println("Masukkan alas : ");
                js.alas = input.nextDouble();
                System.out.println("Masukkan tinggi : ");
                js.tinggi = input.nextDouble();
                js.jenis = "segitiga";
        switch (jenissegitiga) {
            case 1:
                js.view(js.alas,js.tinggi);
                break;
            case 2:
                js.view(js.alas);
                break;
            default:
                System.out.println("Tidak ada dalam pilihan");
                break;
        }
                break;
            default:
                System.out.println("Tidak ada dalam pilihan");
                break;
        }
    }   
}
