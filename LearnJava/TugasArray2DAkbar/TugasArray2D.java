import java.util.Scanner;

public class TugasArray2D {
    public static void main(String[] args) {
        
        String pathWay[][] = {
            {"P", "X", "X", "X", "X", "X", "X", "X", "X", " ", " ", " "},
            {" ", "X", " ", " ", " ", "X", "X", "P3", "X", " ", "X", " "},
            {" ", "X", "X", "X", " ", "P4", " ", " ", " ", " ", "X", " "},
            {" ", "TC", " ", " ", " ", "X", " ", " ", "X", "X", "X", " "},
            {" ", " ", "X", " ", " ", "X", "P2", "X", "X", "X", "X", " "},
            {"P5", " ", "X", "RK", " ", "X", " ", " ", " ", " ", " ", "P1"},
        };
        
        Scanner input = new Scanner(System.in);

        /*int P = 0; 
        int P1 = 0; 
        int P2 = 0; 
        int P3 = 0; 
        int P4 = 0; 
        int X = 0;*/

        char langkah = 'L';
        int posisiBaris = 5;
        int posisiKolom = 12;
        int energi = 0;


        
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
        } else {
            System.out.println("Perintah tidak dikenali");
        }
        System.out.println("Koordinat Baris: " + posisiBaris);
        System.out.println("Koordinat Kolom: " + posisiKolom);
        
    }
}
