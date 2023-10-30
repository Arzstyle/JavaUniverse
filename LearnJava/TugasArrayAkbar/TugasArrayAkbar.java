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

        for (int i = 0; i <= hotelAmaris.length; i++){
            for (int j= 0; j <= hotelAmaris[i].length; j++){
                if (hotelAmaris[i][i].equals(findGuest)) {
                    System.out.println("Tamu berada pada lantai" + 4 + " Kamar " + 1 ;
                }

            }



        }

        
    }
}
