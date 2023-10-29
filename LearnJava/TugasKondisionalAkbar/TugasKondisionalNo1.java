import java.util.Scanner;

public class TugasKondisionalNo1 {

    /*  Nama : Muhamad Akbar Rizky Saputra
        NIM : 20230040236
        Kelas : TI 23 A
     */

    public static void main(String[] args) {

         Scanner input = new Scanner(System.in);

         System.out.println("Masukan nama anda");
         String name = input.nextLine();

         System.out.println("Masukan umur anda");
         int age = input.nextInt();

         input.nextLine();

         System.out.println("Masukan tempat tinggal");
         String place = input.nextLine();

         System.out.println("Masukan uang tabungan dalam $");
         double money = input.nextDouble();

         input.close();

         String major = "";

        if (age > 40 && (place.equals("Nevada") || place.equals("New York") || place.equals("Havana")) && money > 10_000_000) {
            major = "Don";
        } 
        else if (age >= 25 && age <= 40 && (place.equals("New Jersey") || place.equals("Manhattan") || place.equals("Nevada")) && money >= 1_000_000 && money <= 2_000_000) {
            major = "Underboss";
        } 
        else if (age >= 18 && age <= 24 && (place.equals("California") || place.equals("Detroit") || place.equals("Boston")) && money < 1_000_000) {
            major = "Capo";
        }
        if (!major.isEmpty()) {
            System.out.println(name + " kemungkinan adalah seorang anggota mafia  " + major + ",");
        } else {
            System.out.println(name + " tidak mencurigakan.");
        }
        
    


        
        




         

    }
}
