public class TugasArrayAkbar {
    public static void main(String[] args) {
        
        String hotelAmaris[][]={
            {"*" , "*" , "*" , "X" , "*"},
            {"*" , "*" , "*" , "*" , "*"},
            {"*" , "*" , "*" , "*" , "*"},
            {"*" , "*" , "*" , "*" , "X"},
        };
      
        String findGuest = "X";

        for (int f = 0; f <= hotelAmaris.length; f++){
            for (int r = 0; r <= hotelAmaris[f].length; r++){
                if (hotelAmaris[r][f].equals(findGuest)) {
                    System.out.println("Tamu berada di lantai" + (4-f) + " Kamar " + (1 + r) ;
                }
            }
        } 
        int emptyRoom = 0;
    }
}
