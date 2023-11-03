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

        int posisiBaris = 5;
        int posisiKolom = 12;

        for (int i = 0; i < jalurMendaki.length; i++) {
                char langkah  = jalurMendaki[i].charAt(i);
                energy--;
        if (langkah == 'L'){
            posisiBaris = posisiBaris - 1; 
        } else if (langkah == 'R') {
            posisiBaris = posisiBaris + 1; 
        } else if (langkah == 'U') {
            posisiKolom = posisiKolom - 1; 
        } else if (langkah == 'D') {
            posisiKolom = posisiKolom + 1;
        } else if (langkah == 'R'){
            energi += 10;
        } String newPos = jalurMendaki[posisiBaris][posisiKolom];
            if (newPos.equals("P2")  ||
                newPos.equals("P3")  ||
                newPos.equals("P4")  ||
                newPos.equals("P5")  ||
                newPos.equals("TC")  ||
                newPos.equals("RK")) {
                energy += 10;
            }else {
            System.out.println("Mohon maaf, istirahat hanya diperbolehkan di Pos yang tersedia");
            }
        }  
        if (energy <= 0) {
            System.out.println("Jalur anda benar, tapi tenaga anda tidak akan kuat, coba jalur lain atau sempatkan istirahat terlebih dahulu");
            return;
        }
    }
}
