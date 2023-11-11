import java.util.Scanner;

public class TugasArray2D {
    public static void main(String[] args) {

        /* 
            * 1. LLLLLUUULRLDDLDRUULLLUUU
            * 2. LLLLLUUULLDDDRLUULLLUUU
            * 3. LLLLUUUUR
            * 4. LLLLLUUULLDDLDUULLLUUU  
        */
        
        String jalurMendaki[][] = {
            {"P", "X", "X", "X", "X", "X", "X", "X", "X", "", "", ""},
            {"", "X", "", "", "", "X", "X", "P3", "X", "", "X", ""},
            {"", "X", "X", "X", "", "P4", "", "", "", "", "X", ""},
            {"", "TC", "", "", "", "X", "", "", "X", "X", "X", ""},
            {"", "", "X", "", "", "X", "P2", "X", "X", "X", "X", ""},
            {"P5", "", "X", "RK", "", "X", "", "", "", "", "", "P1"},
        };
         
        try (Scanner input = new Scanner(System.in)){   
            System.out.print("Masukan tenaga awal : ");
            int energy = input.nextInt();

            input.nextLine();

            System.out.print("Masukan Jalur : ");
            String jalur = input.nextLine();

            int posisiBaris = 5;
            int posisiKolom = 11;
            boolean restInTheWrongPost = false;

            for (int i = 0; i < jalur.length(); i++) {
                char langkah  = jalur.charAt(i);

                if (langkah == 'R'){
                    String newPos = jalurMendaki[posisiBaris][posisiKolom];
                    if (newPos.equals("P2")  ||
                        newPos.equals("P4")  ||
                        newPos.equals("RK")  ||
                        newPos.equals("P3")  ||
                        newPos.equals("P5")  ||
                        newPos.equals("TC")) {
                        energy += 10;
                    } else {
                        if (posisiKolom < jalurMendaki[0].length - 1 && !jalurMendaki[posisiBaris][posisiKolom + 1].equals("X")) {
                            posisiKolom++; 
                            energy--; 
                        } else {
                            restInTheWrongPost = true;
                            break; 
                        }
                    } 
                } else if (langkah == 'L' && posisiKolom > 0) {
                    posisiKolom--;
                    energy--; 
                } else if (langkah == 'R' && posisiKolom < jalurMendaki[0].length - 1) {
                    posisiKolom++;
                    energy--; 
                } else if (langkah == 'U' && posisiBaris > 0) {
                    posisiBaris--;
                    energy--; 
                } else if (langkah == 'D' && posisiBaris <  jalurMendaki.length - 1) {
                    posisiBaris++;
                    energy--; 
                } else {
                    System.out.println("Tolong masukan input rute yang benar, seperti L, R, U, D, K.");
                    return;
                }

                if (energy <= 0) {
                    System.out.println("Jalur anda benar, tapi tenaga anda tidak akan kuat, coba jalur lain atau sempatkan istirahat terlebih dahulu.");
                    return;
                } else if ( jalurMendaki[posisiBaris][posisiKolom].equals("X")) {
                    System.out.println("Jalur anda salah, anda masuk ke jurang/blank 45.");
                    return;
                } else if ( jalurMendaki[posisiBaris][posisiKolom].equals("P")) {
                    System.out.println("Selamat Pendakian anda berhasil mencapai Puncak Mahameru, sisa tenaga anda " + energy + ".");
                    return;
                }
            }
            if (restInTheWrongPost) {
                System.out.println("Mohon maaf, istirahat hanya diperbolehkan di Pos-pos yang tersedia.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }
}
