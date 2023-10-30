public class TugasArrayAkbar {
    public static void main(String[] args) {
        
        String hotelAmaris[][]={
            {"*" , "*" , "*" , "X" , "*"},
            {"*" , "*" , "*" , "*" , "*"},
            {"*" , "*" , "*" , "*" , "*"},
            {"*" , "*" , "*" , "*" , "X"},
        };
      
        String findChair = "X";
        int emptyChair = 0;

        for (int i = 0; i <= hotelAmaris.length; i++){
            for (int j= 0; j <= hotelAmaris[i].length; j++){
                if (hotelAmaris[i][i].equals(findChair)) {
                    System.out.println("Tamu berada pada lantai");
                }

            }



        }

        
    }
}
