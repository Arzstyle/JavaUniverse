public class TugasArrayAkbar {
    public static void main(String[] args) {
        
        String hotelAmaris[][]={
            {"*" , "*" , "*" , "X" , "*"},
            {"*" , "*" , "*" , "*" , "*"},
            {"*" , "*" , "*" , "*" , "*"},
            {"*" , "*" , "*" , "*" , "X"},
        };
      
        String findGuest = "X";

        for (int i = 0; i <= hotelAmaris.length; i++){
            for (int j= 0; j <= hotelAmaris[i].length; j++){
                if (hotelAmaris[i][i].equals(findGuest)) {
                    System.out.println("Tamu berada di lantai" + (4-i) + " Kamar " + (1 + j) ;
                }
            }
        } 
        int emptyRoom = 0;
    }
}
