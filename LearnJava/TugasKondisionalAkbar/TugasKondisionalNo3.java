import java.util.Scanner;

public class TugasKondisionalNo3 {
    
    /*  Nama : Muhamad Akbar Rizky Saputra
        NIM : 20230040236
        Kelas : TI 23 A
     */

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan nomor punggung kamu ");
        int nomorPunggung = input.nextInt();

        if ( nomorPunggung % 2 == 0){
            if (nomorPunggung >= 50 && nomorPunggung <= 100){
                System.out.println("Posisi kamu adalah Attacker dan kamu cocok untuk jadi Captain Team.");
            } else {
                System.out.println("Posisi kamu adalah Attacker.");
                }    
        } else if (nomorPunggung % 2 == 1) {
            System.out.println("Posisi kamu adalah Defender.");
            if (nomorPunggung >= 90){
                System.out.println("Posisi kamu adalah Playmaker.");
            } else if (nomorPunggung >= 3 && nomorPunggung < 6){
                System.out.println("Posisi kamu adalah Kiper.");
                } 
        } else {
            System.out.println("Tolong masukan angka yang benar.");
            } 

        input.close(); 
    }
}
