public class TugasArrayAkbar {
    public static void main(String[] args) {
        
        String hotelAmaris[][]={
            {"*" , "*" , "*" , "X" , "*"},
            {"*" , "*" , "*" , "*" , "*"},
            {"*" , "*" , "*" , "*" , "*"},
            {"*" , "*" , "*" , "*" , "X"},
        };
        
        String findGuest = "X";
        int emptyRoom = 0;

        // f = floor
        // r = room
        for (int f = 0; f < hotelAmaris.length; f++){
            for (int r = 0; r < hotelAmaris[f].length; r++){
                if (hotelAmaris[f][r].equals(findGuest)) {
                    System.out.println("Tamu berada di lantai" + (4 - f) + " Kamar " + (r + 1)) ;
                }
                // No 2
                if (hotelAmaris[f][r] == "*") {
                    emptyRoom++;
                }
            }
        } 
        System.out.print("Jumlah Kamar yang tersedia adalah " + emptyRoom + " Kamar ");
    }
}
