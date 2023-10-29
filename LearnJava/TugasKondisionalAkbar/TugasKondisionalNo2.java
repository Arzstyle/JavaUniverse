import java.util.Scanner;

public class TugasKondisionalNo2 {

/*  Nama : Muhamad Akbar Rizky Saputra
    Nim : 20230040236
    Kelas : TI 23 A
    */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Masukan nilai coding");
        int nilaiCoding = input.nextInt();

        System.out.println("Masukan nilai interview untuk lulus yaitu A atau B");
        String nilaiInterview = input.next();


        if (nilaiCoding < 0 || nilaiCoding > 100){
            System.out.println("Maaf, nilai koding harus diantara 0 - 100.");
        } else {
            if (nilaiCoding >= 80){
                System.out.println("Kamu lolos test coding");
            } else if (nilaiCoding >= 60) {
                System.out.println("Hasil kamu dipertimbangkan");
            } else if (nilaiCoding <= 60){
                System.out.println("Kamu gagal test interview");
            }
        }


        if (nilaiInterview.equals("A") || (nilaiInterview.equals("B"))){
            System.out.println("Kamu lolos test interview");
        } else {
            System.out.println("Kamu gagal test interview");
        }
        

        if ((nilaiCoding > 80 || (nilaiCoding >= 60 && nilaiCoding <= 80)) && (nilaiInterview.equals("A") || nilaiInterview.equals("B"))){
            System.out.println("Selamat kamu berhasil jadi Programmer");
        }else {
            System.out.println("Maaf Kamu Belum Berhasil Menjadi Calon Programmer");
        }
        input.close();
    }
}
