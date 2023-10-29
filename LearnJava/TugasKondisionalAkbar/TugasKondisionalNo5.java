import java.text.DecimalFormat;
import java.util.Scanner;

public class TugasKondisionalNo5 {

    /*  Nama : Muhamad Akbar Rizky Saputra
        NIM : 20230040236
        Kelas : TI 23 A
     */

    public static void main(String[] args) {

        
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan umur anda ");
        int age = input.nextInt();

        int tarif_wahana = 0;

        if (age < 1) {
            System.out.println("Maaf, anda dilarang masuk karena umur");
        } else if (age <= 3) {
            tarif_wahana = 30_000;
            DecimalFormat decimalFormat = new DecimalFormat("#,###");
            System.out.println("Tarif wahana Rp. " + decimalFormat.format(tarif_wahana));
            System.out.println("Masukkan tinggi anda ");

            int tinggi = input.nextInt();
            if ((age >= 2 && age <= 3) && (tinggi >= 70)) {
                tarif_wahana += 10_000;
                System.out.println("Tarif wahana bertambah menjadi Rp. " + decimalFormat.format(tarif_wahana));
            } else {
                System.out.println("Tarif wahana tetap Rp. " + decimalFormat.format(tarif_wahana));
            }

        } else if (age <= 7){
            tarif_wahana = 40_000;
            DecimalFormat decimalFormat = new DecimalFormat("#,###");
            System.out.println("Tarif wahana Rp. " + decimalFormat.format(tarif_wahana));
            System.out.println("Masukan tinggi anda ");

            int tinggi = input.nextInt();
            if ((age >= 4 && age <= 7 ) && (tinggi >= 120)) {
                tarif_wahana += 15_000;
                System.out.println("Tarif wahana bertambah menjadi Rp. " + decimalFormat.format(tarif_wahana));
            } else {
                System.out.println("Tarif wahana tetap Rp. " + decimalFormat.format(tarif_wahana));
            }

        } else if (age <= 10) {
            tarif_wahana = 50_000;
            DecimalFormat decimalFormat = new DecimalFormat("#,###");
            System.out.println("Tarif wahana Rp. " + decimalFormat.format(tarif_wahana));
            System.out.println("Masukan tinggi anda ");

            int tinggi = input.nextInt();
            if ((age >= 8 && age <= 10 ) && (tinggi >= 150)) {
                tarif_wahana += 20_000;
                System.out.println("Tarif wahana bertambah menjadi Rp. " + decimalFormat.format(tarif_wahana));
            } else {
                System.out.println("Tarif wahana tetap Rp. " + decimalFormat.format(tarif_wahana));
            }

        } else {
            tarif_wahana = 80_000;
            DecimalFormat decimalFormat = new DecimalFormat("#,###");
            System.out.println("Tarif wahana Rp. " + decimalFormat.format(tarif_wahana));
        }
        
        input.close();
    }
}
    

