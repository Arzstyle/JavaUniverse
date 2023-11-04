import java.util.Scanner;

public class TugasArray2D {
    public static void main(String[] args) {
        
        String jalurMendaki[][] = {
            {"P", "X", "X", "X", "X", "X", "X", "X", "X", " ", " ", " "},
            {" ", "X", " ", " ", " ", "X", "X", "P3", "X", " ", "X", " "},
            {" ", "X", "X", "X", " ", "P4", " ", " ", " ", " ", "X", " "},
            {" ", "TC", " ", " ", " ", "X", " ", " ", "X", "X", "X", " "},
            {" ", " ", "X", " ", " ", "X", "P2", "X", "X", "X", "X", " "},
            {"P5", " ", "X", "RK", " ", "X", " ", " ", " ", " ", " ", "P1"},
        };

        //Jalur 1 = LLLLLUUULKLDDLDKUULLLUUU
        //Jalur 2 = LLLLLUUULLDDDKLUULLLUUU
        //Jalur 3 = LLLLUUUUK
        //Jalur 4 = LLLLLUUULLDDLDUULLLUUU
         
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan tenaga awal : ");
        int energy = input.nextInt();

        System.out.print("Masukan Jalur : ");
        String jalur = input.next();
        
        input.close();

        int posisiPlayer = 5;
        int posisiKolom = 12;

        for (int i = 0; i < jalur.length(); i++) {
                char langkah  = jalur.charAt(i);
                energy--;
        if (langkah == 'L' && posisiKolom > 0 ){
                posisiKolom--;
            } else if (langkah == 'R' && posisiKolom < jalurMendaki[0].length -1 ){
                posisiKolom++; 
            } else if (langkah == 'U' && posisiPlayer >  0) {
                posisiPlayer--;
            } else if (langkah == 'D' && posisiPlayer < jalurMendaki.length -1 ){
                posisiPlayer++;
            } else if (langkah == 'R'){
            String newPos = jalurMendaki[posisiPlayer][posisiKolom];
            if (newPos.equals("P2")  ||
                newPos.equals("P3")  ||
                newPos.equals("P4")  ||
                newPos.equals("P5")  ||
                newPos.equals("TC")  ||
                newPos.equals("RK")) {
                energy += 10;
            }else {
            System.out.println("Mohon maaf, istirahat hanya diperbolehkan di Pos yang tersedia");
            return;
            }
        }  
        if (energy <= 0) {
            System.out.println("Jalur anda benar, tapi tenaga anda tidak akan kuat, coba jalur lain atau sempatkan istirahat terlebih dahulu");
            return;
            } else if (jalurMendaki[posisiPlayer][posisiKolom].equals("X")) {
            System.out.println("Jalur anda salah, anda masuk ke jurang/blank 45");
            return;
            } else if (jalurMendaki[posisiPlayer][posisiKolom].equals("P")) {
            System.out.println("Selamat Pendakian anda berhasil mencapai Puncak Mahameru, sisa tenaga anda " + energy);
            return;
            }
        }  
    }
}
